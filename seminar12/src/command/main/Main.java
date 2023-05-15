package command.main;

import command.classes.Autobuz;
import command.classes.Automobil;
import command.classes.CommandPlecareInCursa;
import command.classes.ManagerComenzi;

import java.lang.management.MemoryNotificationInfo;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Automobil autobuz = new Autobuz(13);

        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(23)));

        managerComenzi.executaComanda();


        managerComenzi.executaComanda();


    }
}