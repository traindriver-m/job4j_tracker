package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковского сервиса
 * с функциями добавления клиентов(пользователей) и счетов,
 * поиска счетов по заданным параметрам, а также
 * перевода денежных средств между этими счетами.
 *
 * @author Oblaukhov Sergey
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных осуществляется в коллекции типа HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового клиента и список его счетов,
     * реализованный посредством ArrayList в коллекцию users
     *
     * @param user пользователь(клиент) который добавляется в коллекцию
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет счет в список счетов пользователя при уловии,
     * что такого счета уже нет в списке.
     *
     * @param passport принимает паспортные данные пользователя для его поиска
     * @param account  принимает объект, несущий в себе данные банковского счёта.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> tempList = users.get(user.get());
            if (!tempList.contains(account)) {
                tempList.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя в коллекции users по данным паспорта
     *
     * @param passport принимает данные паспорта пользователя для его поиска
     * @return возвращает найденного пользователя или null если пользователь не найден
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter((e) -> e.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод осуществляет поиск конкретного счета пользователя в списке его счетов
     *
     * @param passport  принимает данные паспорта для поиска пользователя
     * @param requisite принимает номер счета для поиска среди других возможных счетов пользователя
     * @return возвращает найенный счет или null если счет не найден
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> optionalUser = findByPassport(passport);
        return optionalUser.map(user -> users.get(user)
                .stream()
                .filter((e) -> e.getRequisite().equals(requisite))
                .findFirst()).orElse(null);
    }

    /**
     * Метод реализует перевод средств между счетами
     *
     * @param srcPassport   принимает паспортные данные пользователя осуществляющего перевод
     * @param srcRequisite  принимает реквизиты счёта с которого будет производиться перевод
     * @param destPassport  принимает паспортные данные пользователя
     *                      которому будет произведен перевод
     * @param destRequisite принимает реквизиты счёта на который будет производиться перевод
     * @param amount        принимает сумму которая будет переводиться со счета на счет
     * @return возвращает информацию о результате операции типа: выполнена/не выполнена
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            destAccount.get().setBalance(amount + destAccount.get().getBalance());
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
