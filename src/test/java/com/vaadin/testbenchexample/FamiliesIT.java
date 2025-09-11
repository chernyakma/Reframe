package com.vaadin.testbenchexample;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class FamiliesIT extends BaseLoginTest{

    @Test

    public void addFamilyAlabama() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(1  );
        Assertions.assertEquals( "Alabama", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1960, 4, 1 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(0);
        setAddress.getState().selectByText( "Alabama" );
        Assertions.assertEquals("Alabama",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test

    public void addFamilyAlaska() {

 //       getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        	getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(2  );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        Assertions.assertEquals( "Alaska", family.getLastName().getValue() );
        family.getDateOfBirth().setDate( LocalDate.of( 1990, 5, 1 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(1);
        setAddress.getState().selectByText( "Alaska" );
        Assertions.assertEquals("Alaska",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();


    }


    @Test

    public void addFamilyArizona() {

     //   getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(3  );
        Assertions.assertEquals( "Arizona", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1958, 6, 15 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(2);
        setAddress.getState().selectByText( "Arizona" );
        Assertions.assertEquals("Arizona",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test

    public void addFamilyArkansas() {

     //   getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(4  );
        Assertions.assertEquals( "Arkansas", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1987, 8, 1 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(3);
        setAddress.getState().selectByText( "Arkansas" );
        Assertions.assertEquals("Arkansas",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }

    @Test

    public void addFamilyCalifornia() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(5  );
        Assertions.assertEquals( "California", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1977, 4, 5 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(4);
        setAddress.getState().selectByText( "California" );
        Assertions.assertEquals("California",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test

    public void addFamilyColorado() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(6  );
        Assertions.assertEquals( "Colorado", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1961, 6, 7 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(5);
        setAddress.getState().selectByText( "Colorado" );
        Assertions.assertEquals("Colorado",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test

    public void addFamilyConnecticut() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(7  );
        Assertions.assertEquals( "Connecticut", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1991, 7, 12 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(6);
        setAddress.getState().selectByText( "Connecticut" );
        Assertions.assertEquals("Connecticut",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test

    public void addFamilyDelaware() {

     //   getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(8  );
        Assertions.assertEquals( "Delaware", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1990, 8, 4 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(7);
        setAddress.getState().selectByText( "Delaware" );
        Assertions.assertEquals("Delaware",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }

    @Test

    public void addFamilyFlorida() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(9  );
        Assertions.assertEquals( "Florida", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1963, 7, 15 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(8);
        setAddress.getState().selectByText( "Florida" );
        Assertions.assertEquals("Florida",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }

    @Test

    public void addFamilyGeorgia() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(10  );
        Assertions.assertEquals( "Georgia", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1999, 9, 23 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(9);
        setAddress.getState().selectByText( "Georgia" );
        Assertions.assertEquals("Georgia",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test

    public void addFamilyHawaii() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(11  );
        Assertions.assertEquals( "Hawaii", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 2000, 10, 1 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(10);
        setAddress.getState().selectByText( "Hawaii" );
        Assertions.assertEquals("Hawaii",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test

    public void addFamilyIdaho() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(12  );
        Assertions.assertEquals( "Idaho", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1985, 6, 14 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(11);
        setAddress.getState().selectByText( "Idaho" );
        Assertions.assertEquals("Idaho",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test

    public void addFamilyIllinois() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");
        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(13  );
        Assertions.assertEquals( "Illinois", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1976, 6, 19 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(12);
        setAddress.getState().selectByText( "Illinois" );
        Assertions.assertEquals("Illinois",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyIndiana() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(14  );
        Assertions.assertEquals( "Indiana", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1970, 6, 15 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(13);
        setAddress.getState().selectByText( "Indiana" );
        Assertions.assertEquals("Indiana",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyIowa() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(15  );
        Assertions.assertEquals( "Iowa", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1965, 8, 3 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(14);
        setAddress.getState().selectByText( "Iowa" );
        Assertions.assertEquals("Iowa",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyKansas() {

     //   getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(16  );
        Assertions.assertEquals( "Kansas", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 2002, 9, 12 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(15);
        setAddress.getState().selectByText( "Kansas" );
        Assertions.assertEquals("Kansas",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyKentucky() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(17  );
        Assertions.assertEquals( "Kentucky", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1967, 9, 30 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(16);
        setAddress.getState().selectByText( "Kentucky" );
        Assertions.assertEquals("Kentucky",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyLouisiana() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(18  );
        Assertions.assertEquals( "Louisiana", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1966, 9, 24 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(17);
        setAddress.getState().selectByText( "Louisiana" );
        Assertions.assertEquals("Louisiana",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyMaine() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(19  );
        Assertions.assertEquals( "Maine", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 2005, 9, 12 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(18);
        setAddress.getState().selectByText( "Maine" );
        Assertions.assertEquals("Maine",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyMaryland() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(20  );
        Assertions.assertEquals( "Maryland", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1987, 9, 6 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(19);
        setAddress.getState().selectByText( "Maryland" );
        Assertions.assertEquals("Maryland",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyMassachusetts() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(21  );
        Assertions.assertEquals( "Massachusetts", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1965, 6, 15 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(20);
        setAddress.getState().selectByText( "Massachusetts" );
        Assertions.assertEquals("Massachusetts",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyMichigan() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(22  );
        Assertions.assertEquals( "Michigan", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1973, 6, 8 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(21);
        setAddress.getState().selectByText( "Michigan" );
        Assertions.assertEquals("Michigan",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyMinnesota() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(23  );
        Assertions.assertEquals( "Minnesota", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1995, 7, 1 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(22);
        setAddress.getState().selectByText( "Minnesota" );
        Assertions.assertEquals("Minnesota",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyMississippi() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(24  );
        Assertions.assertEquals( "Mississippi", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 1 );
        family.getDateOfBirth().setDate( LocalDate.of( 1980, 8, 5 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(23);
        setAddress.getState().selectByText( "Mississippi" );
        Assertions.assertEquals("Mississippi",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyMissouri() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(25  );
        Assertions.assertEquals( "Missouri", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1960, 4, 1 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(24);
        setAddress.getState().selectByText( "Missouri" );
        Assertions.assertEquals("Missouri",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyMontana() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(26  );
        Assertions.assertEquals( "Montana", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1990, 5, 1 ) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(25);
        setAddress.getState().selectByText( "Montana" );
        Assertions.assertEquals("Montana",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyNebraska() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(27  );
        Assertions.assertEquals( "Nebraska", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1958, 6, 15) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(26);
        setAddress.getState().selectByText( "Nebraska" );
        Assertions.assertEquals("Nebraska",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyNevada() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(28  );
        Assertions.assertEquals( "Nevada", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1987, 8, 1) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(27);
        setAddress.getState().selectByText( "Nevada" );
        Assertions.assertEquals("Nevada",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyNewHampshire() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(29  );
        Assertions.assertEquals( "New Hampshire", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1977, 4, 5) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(28);
        setAddress.getState().selectByText( "New Hampshire" );
        Assertions.assertEquals("New Hampshire",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyNewJersey() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(30  );
        Assertions.assertEquals( "New Jersey", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1961, 6, 7) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(29);
        setAddress.getState().selectByText( "New Jersey" );
        Assertions.assertEquals("New Jersey",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyNewMexico() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(31  );
        Assertions.assertEquals( "New Mexico", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1991, 7, 12) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(30);
        setAddress.getState().selectByText( "New Mexico" );
        Assertions.assertEquals("New Mexico",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyNewYork() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(32  );
        Assertions.assertEquals( "New York", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1990, 8, 4) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(31);
        setAddress.getState().selectByText( "New York" );
        Assertions.assertEquals("New York",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyNorthCarolina() {

     //   getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(33  );
        Assertions.assertEquals( "North Carolina", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1963, 7, 15) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(32);
        setAddress.getState().selectByText( "North Carolina" );
        Assertions.assertEquals("North Carolina",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyNorthDakota() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(34  );
        Assertions.assertEquals( "North Dakota", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1999, 9, 23) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(33);
        setAddress.getState().selectByText( "North Dakota" );
        Assertions.assertEquals("North Dakota",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyOhio() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(35  );
        Assertions.assertEquals( "Ohio", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 2000, 10, 1) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(34);
        setAddress.getState().selectByText( "Ohio" );
        Assertions.assertEquals("Ohio",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyOklahoma() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(36  );
        Assertions.assertEquals( "Oklahoma", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1985, 6, 14) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(35);
        setAddress.getState().selectByText( "Oklahoma" );
        Assertions.assertEquals("Oklahoma",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyOregon() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(37  );
        Assertions.assertEquals( "Oregon", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1976, 6, 19) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(36);
        setAddress.getState().selectByText( "Oregon" );
        Assertions.assertEquals("Oregon",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyPennsylvania() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(38  );
        Assertions.assertEquals( "Pennsylvania", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1970, 6, 15) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(37);
        setAddress.getState().selectByText( "Pennsylvania" );
        Assertions.assertEquals("Pennsylvania",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyRhodeIsland() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(39  );
        Assertions.assertEquals( "Rhode Island", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1965, 8, 3) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(38);
        setAddress.getState().selectByText( "Rhode Island" );
        Assertions.assertEquals("Rhode Island",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilySouthDakota() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(41  );
        Assertions.assertEquals( "South Dakota", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1967, 9, 30) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(40);
        setAddress.getState().selectByText( "South Dakota" );
        Assertions.assertEquals("South Dakota",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyTennessee() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(42  );
        Assertions.assertEquals( "Tennessee", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1966, 9, 24) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(41);
        setAddress.getState().selectByText( "Tennessee" );
        Assertions.assertEquals("Tennessee",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyTexas() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(43  );
        Assertions.assertEquals( "Texas", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 2005, 9, 12) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(42);
        setAddress.getState().selectByText( "Texas" );
        Assertions.assertEquals("Texas",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyUtah() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(44  );
        Assertions.assertEquals( "Utah", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1987, 9, 6) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(43);
        setAddress.getState().selectByText( "Utah" );
        Assertions.assertEquals("Utah",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyVermont() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(45  );
        Assertions.assertEquals( "Vermont", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1965, 6, 15) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(44);
        setAddress.getState().selectByText( "Vermont" );
        Assertions.assertEquals("Vermont",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyVirginia() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(46  );
        Assertions.assertEquals( "Virginia", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 2007, 8, 3) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(45);
        setAddress.getState().selectByText( "Virginia" );
        Assertions.assertEquals("Virginia",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyWashington() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(47  );
        Assertions.assertEquals( "Washington", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1973, 6, 8) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(46);
        setAddress.getState().selectByText( "Washington" );
        Assertions.assertEquals("Washington",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyWestVirginia() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(48  );
        Assertions.assertEquals( "West Virginia", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1995, 7, 1) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(47);
        setAddress.getState().selectByText( "West Virginia" );
        Assertions.assertEquals("West Virginia",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyWisconsin() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(49  );
        Assertions.assertEquals( "Wisconsin", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 1980, 8, 5) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(48);
        setAddress.getState().selectByText( "Wisconsin" );
        Assertions.assertEquals("Wisconsin",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }
    @Test
    public void addFamilyWyoming() {

    //    getDriver().get( "http://localhost:8080/reframe_webui/familyInsured" );
        getDriver().get( "https://test.reframe.calcfocus.net/achieve/familyInsured/");

        AddFamilyView family = $( AddFamilyView.class ).first();
        family.addFamily(50  );
        Assertions.assertEquals( "Wyoming", family.getLastName().getValue() );
        family.getSuffix().selectByText("Sr.");
        family.getGender().selectItemByIndex( 0 );
        family.getDateOfBirth().setDate( LocalDate.of( 2001, 9, 18) );
        family.getSaveButton().click();
        NaviMenuView getAddress = $(NaviMenuView.class).first();
        getAddress.getAddresses().click();
        ScenarioView addAddress = $(ScenarioView.class).first();
        addAddress.getAddButton().click();
        AddressView setAddress=$ (AddressView.class).first();
        setAddress.getCountry().selectByText( "USA" );
        setAddress.addAddress(49);
        setAddress.getState().selectByText( "Wyoming" );
        Assertions.assertEquals("Wyoming",setAddress.getState().getSelectedText());
        setAddress.getDefaultMailing().click();
        setAddress.getDefaultBilling().click();
        setAddress.getDefaultResidence().click();
        setAddress.getOkButton().click();
        addAddress.getSaveButton().click();
    }




}




