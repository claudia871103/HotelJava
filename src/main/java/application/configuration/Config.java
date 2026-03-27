package application.configuration;

import application.domain.Guest;
import application.repository.GuestRepository;
import application.service.GuestService;
import application.service.GuestServiceImpl;
import application.userinterface.MenuApp;
import application.view.GuestView;

public class Config {

    public static MenuApp createMenuApp(){

        Guest guest = new Guest();
        GuestRepository guestRepository = new GuestRepository();
        GuestService guestService = new GuestServiceImpl(guestRepository);
        GuestView guestView = new GuestView(guestService, guest);


        return new MenuApp(guestView);
    }






}
