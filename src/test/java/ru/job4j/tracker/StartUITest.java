package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;

import static org.hamcrest.Matchers.nullValue;

import static org.junit.Assert.*;

public class StartUITest {

//    @Test
//    public void whenCreateItem() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[]{"0", "Item name", "1"}
//        );
//        MemTracker tracker = new MemTracker();
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new CreateAction(out));
//        actions.add(new ExitAction());
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
//    }
//
//    @Test
//    public void whenReplaceItem() {
//        Output out = new StubOutput();
//        MemTracker tracker = new MemTracker();
//        Item item = tracker.add(new Item("Replaced item"));
//        String replacedName = "New item name";
//        String id = String.valueOf(item.getId());
//        Input in = new StubInput(
//                new String[]{"0", id, replacedName, "1"}
//        );
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new EditAction(out));
//        actions.add(new ExitAction());
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
//    }
//
//    @Test
//    public void whenFindAll() {
//        Output out = new StubOutput();
//        MemTracker tracker = new MemTracker();
//        Input in = new StubInput(new String[]{"0", "1"});
//        Item item = tracker.add(new Item("New item"));
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new ShowAllAction(out));
//        actions.add(new ExitAction());
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is("Menu." + System.lineSeparator()
//                + "0. Show all items" + System.lineSeparator()
//                + "1. Exit Program" + System.lineSeparator()
//                + "=== Show all items ===" + System.lineSeparator()
//                + item + System.lineSeparator()
//                + "Menu." + System.lineSeparator()
//                + "0. Show all items" + System.lineSeparator()
//                + "1. Exit Program" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whnFindByName() {
//        Output out = new StubOutput();
//        MemTracker tracker = new MemTracker();
//        Item item = tracker.add(new Item("Target item"));
//        String name = item.getName();
//        Input in = new StubInput(new String[]{"0", name, "1"});
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new FindByNameAction(out));
//        actions.add(new ExitAction());
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is("Menu." + System.lineSeparator()
//                + "0. Find items by name" + System.lineSeparator()
//                + "1. Exit Program" + System.lineSeparator()
//                + "=== Find items by name ===" + System.lineSeparator()
//                + item + System.lineSeparator()
//                + "Menu." + System.lineSeparator()
//                + "0. Find items by name" + System.lineSeparator()
//                + "1. Exit Program" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whenFindById() {
//        Output out = new StubOutput();
//        MemTracker tracker = new MemTracker();
//        Item item = tracker.add(new Item("Target item"));
//        String id = String.valueOf(item.getId());
//        Input in = new StubInput(new String[]{"0", id, "1"});
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new FindByIdAction(out));
//        actions.add(new ExitAction());
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is("Menu." + System.lineSeparator()
//                + "0. Find item by id" + System.lineSeparator()
//                + "1. Exit Program" + System.lineSeparator()
//                + "=== Find item by id ===" + System.lineSeparator()
//                + item + System.lineSeparator()
//                + "Menu." + System.lineSeparator()
//                + "0. Find item by id" + System.lineSeparator()
//                + "1. Exit Program" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Output out = new StubOutput();
//        MemTracker tracker = new MemTracker();
//        Item item = tracker.add(new Item("Deleted item"));
//        String id = String.valueOf(item.getId());
//        Input in = new StubInput(
//                new String[]{"0", id, "1"}
//        );
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new DeleteAction(out));
//        actions.add(new ExitAction());
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), is(nullValue()));
//    }
//
//    @Test
//    public void whenExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[]{"0"});
//        MemTracker tracker = new MemTracker();
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new ExitAction());
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is("Menu." + System.lineSeparator()
//                + "0. Exit Program" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whenInvalidExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[]{"9", "0"}
//        );
//        MemTracker tracker = new MemTracker();
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new ExitAction());
//        new StartUI(out).init(in, tracker, actions);
//        String ln = System.lineSeparator();
//        assertThat(out.toString(), is(
//                "Menu." + ln
//                        + "0. Exit Program" + ln
//                        + "Wrong input, you can select: 0 .. 0" + ln
//                        + "Menu." + ln
//                        + "0. Exit Program" + ln
//                )
//        );
//    }
}