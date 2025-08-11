package com.xworkz.string.runner;

import com.xworkz.string.internal.*;

public class Main {
    public static void main(String[] args) {

        Microwave mw = new Microwave ("Samsung",900, true);
        System.out.println(mw);
        System.out.println(mw.hashCode());
        System.out.println("Original:"+System.identityHashCode(mw));
        System.out.println("---------------------------------------------");

        ElectricIron iron = new ElectricIron("Philips", 1200, true);
        System.out.println(iron);
        System.out.println(iron.hashCode());
        System.out.println("Original:"+System.identityHashCode(iron));
        System.out.println("----------------------------------------------");

        CeilingFan fan = new CeilingFan("Orient", 5, true);
        System.out.println(fan);
        System.out.println(fan.hashCode());
        System.out.println("Original:"+System.identityHashCode(fan));
        System.out.println("---------------------------------------------");

        Toaster ts = new Toaster("Nova", 2, true);
        System.out.println(ts);
        System.out.println(ts.hashCode());
        System.out.println("Original:"+System.identityHashCode(ts));
        System.out.println("------------------------------------------------");

        AirCooler ac = new AirCooler("Bajaj", 20, true);
        System.out.println(ac);
        System.out.println(ac.hashCode());
        System.out.println("Original:"+System.identityHashCode(ac));
        System.out.println("--------------------------------------------------");

        WaterPurifier wp = new WaterPurifier("Kent", true, 10);
        System.out.println(wp);
        System.out.println(wp.hashCode());
        System.out.println("Original:"+System.identityHashCode(wp));
        System.out.println("--------------------------------------------------");

        InductionStove is = new InductionStove("Pigeon", 2000, true);
        System.out.println(is);
        System.out.println(is.hashCode());
        System.out.println("Original:"+System.identityHashCode(is));
        System.out.println("--------------------------------------------------");

        HairDryer hd = new HairDryer("Syska", 2, true);
        System.out.println(hd);
        System.out.println(hd.hashCode());
        System.out.println("Original:"+ System.identityHashCode(hd));
        System.out.println("---------------------------------------------------");

        PowerBank pb = new PowerBank("Boat", 10000, false);
        System.out.println(pb);
        System.out.println(pb.hashCode());
        System.out.println("Original:"+System.identityHashCode(pb));
        System.out.println("-------------------------------------------------------");

        ElectricKettle ek = new ElectricKettle("Prestige", 1.5, true);
        System.out.println(ek);
        System.out.println(ek.hashCode());
        System.out.println("Original:"+System.identityHashCode(ek));
        System.out.println("--------------------------------------------------------");

        MixerGrinder mg = new MixerGrinder("Butterfly", 3, true);
        System.out.println(mg);
        System.out.println(mg.hashCode());
        System.out.println("Original:"+System.identityHashCode(mg));
        System.out.println("-------------------------------------------------------");


        SmartTV tv = new SmartTV("Sony", 43, true);
        System.out.println(tv);
        System.out.println(tv.hashCode());
        System.out.println("Original:"+System.identityHashCode(tv));
        System.out.println("-------------------------------------------------------");

        ElectricBlanket eb = new ElectricBlanket("Fleece", 3, true);
        System.out.println(eb);
        System.out.println(eb.hashCode());
        System.out.println("Original:"+System.identityHashCode(eb));
        System.out.println("-------------------------------------------------------");

        SmartWatch sw = new SmartWatch("Realme", true, 48);
        System.out.println(sw);
        System.out.println(sw.hashCode());
        System.out.println("Original:"+System.identityHashCode(sw));
        System.out.println("-------------------------------------------------------");

        BluetoothSpeaker bs = new BluetoothSpeaker("JBL", 10, true);
        System.out.println(bs);
        System.out.println(bs.hashCode());
        System.out.println("Original:"+System.identityHashCode(bs));
        System.out.println("-------------------------------------------------------");

        PortableHeater ph = new PortableHeater("Oil", 1500, true);
        System.out.println(ph);
        System.out.println(ph.hashCode());
        System.out.println("Original:"+System.identityHashCode(ph));
        System.out.println("-------------------------------------------------------");

        CoffeeMaker cm = new CoffeeMaker("Delonghi", 5, true);
        System.out.println(cm);
        System.out.println(cm.hashCode());
        System.out.println("Original:"+System.identityHashCode(cm));
        System.out.println("-------------------------------------------------------");

        RiceCooker rc = new RiceCooker("Panasonic", 2.2, true);
        System.out.println(rc);
        System.out.println(rc.hashCode());
        System.out.println("Original:"+System.identityHashCode(rc));
        System.out.println("-------------------------------------------------------");

        AlarmClocks alarmClock = new AlarmClocks("Digital", true, true);
        System.out.println(alarmClock);
        System.out.println(alarmClock.hashCode());
        System.out.println("Original:"+System.identityHashCode(alarmClock));
        System.out.println("-------------------------------------------------------");

        Dishwasher dw = new Dishwasher("Bosch", 2, true);
        System.out.println(dw);
        System.out.println(dw.hashCode());
        System.out.println("Original:"+System.identityHashCode(dw));
        System.out.println("-------------------------------------------------------");

        ElectricToothbrush et = new ElectricToothbrush("OralB", 3, true);
        System.out.println(et);
        System.out.println(et.hashCode());
        System.out.println("Original:"+System.identityHashCode(et));
        System.out.println("-------------------------------------------------------");

        RoomHeater rh = new RoomHeater("Infrared", 2000, false);
        System.out.println(rh);
        System.out.println(rh.hashCode());
        System.out.println("Original:"+System.identityHashCode(rh));
        System.out.println("-------------------------------------------------------");

        Soda soda = new Soda("Pepsi", "Cola", 500);
        System.out.println(soda);
        System.out.println(soda.hashCode());
        System.out.println("Original:"+System.identityHashCode(soda));
        System.out.println("-------------------------------------------------------");

        Milkshake shake = new Milkshake("Strawberry", "Medium", true);
        System.out.println(shake);
        System.out.println(shake.hashCode());
        System.out.println("Original:"+System.identityHashCode(shake));
        System.out.println("-------------------------------------------------------");

        HotChocolate hotChoco = new HotChocolate("Large", true, "Oat");
        System.out.println(hotChoco);
        System.out.println(hotChoco.hashCode());
        System.out.println("Original:"+System.identityHashCode(hotChoco));
        System.out.println("-------------------------------------------------------");

        Chocolate choco = new Chocolate("Dark", "Lindt", true);
        System.out.println(choco);
        System.out.println(choco.hashCode());
        System.out.println("Original:"+System.identityHashCode(choco));
        System.out.println("-------------------------------------------------------");

        Vanilla vanilla = new Vanilla("Madagascar", "Extract", true);
        System.out.println(vanilla);
        System.out.println(vanilla.hashCode());
        System.out.println("Original:"+System.identityHashCode(vanilla));
        System.out.println("-------------------------------------------------------");

        ComicBook comic = new ComicBook("The Dark Knight", "Batman", 120);
        System.out.println(comic);
        System.out.println(comic.hashCode());
        System.out.println("Original:"+System.identityHashCode(comic));
        System.out.println("-------------------------------------------------------");

        Samosa samosa = new Samosa("Potato & Peas", 250, true);
        System.out.println(samosa);
        System.out.println(samosa.hashCode());
        System.out.println("Original:"+System.identityHashCode(samosa));
        System.out.println("-------------------------------------------------------");

        Jalebi jalebi = new Jalebi("Golden Orange", 6, true);
        System.out.println(jalebi);
        System.out.println(jalebi.hashCode());
        System.out.println("Original:"+System.identityHashCode(jalebi));
        System.out.println("-------------------------------------------------------");

        KajuBarfi sweet = new KajuBarfi("Diamond", 50, true);
        System.out.println(sweet);
        System.out.println(sweet.hashCode());
        System.out.println("Original:"+System.identityHashCode(sweet));
        System.out.println("-------------------------------------------------------");

        Mango mango = new Mango("Alphonso", "Ratnagiri", true);
        System.out.println(mango);
        System.out.println(mango.hashCode());
        System.out.println("Original:"+System.identityHashCode(mango));
        System.out.println("-------------------------------------------------------");

        Cupcake cupcake = new Cupcake("Vanilla", "Pink", true);
        System.out.println(cupcake);
        System.out.println(cupcake.hashCode());
        System.out.println("Original:"+System.identityHashCode(cupcake));
        System.out.println("-------------------------------------------------------");

        Cushion cushion = new Cushion("Round", "Velvet", true);
        System.out.println(cushion);
        System.out.println(cushion.hashCode());
        System.out.println("Original:"+System.identityHashCode(cushion));
        System.out.println("-------------------------------------------------------");

        Blanket blanket = new Blanket("Fleece", "Queen", false);
        System.out.println(blanket);
        System.out.println(blanket.hashCode());
        System.out.println("Original:"+System.identityHashCode(blanket));
        System.out.println("-------------------------------------------------------");

        CoffeeMug mug = new CoffeeMug("Matte Black", 350, true);
        System.out.println(mug);
        System.out.println(mug.hashCode());
        System.out.println("Original:"+System.identityHashCode(mug));
        System.out.println("-------------------------------------------------------");

        Bluetooth bt = new Bluetooth("5.2", 30, true);
        System.out.println(bt);
        System.out.println(bt.hashCode());
        System.out.println("Original:"+System.identityHashCode(bt));
        System.out.println("-------------------------------------------------------");

        InstantCamera cam = new InstantCamera("Fujifilm", "2x3 inches", true);
        System.out.println(cam);
        System.out.println(cam.hashCode());
        System.out.println("Original:"+System.identityHashCode(cam));
        System.out.println("-------------------------------------------------------");


        Teddy teddy = new Teddy("Brown", 95, true);
        System.out.println(teddy);
        System.out.println(teddy.hashCode());
        System.out.println("Original:"+System.identityHashCode(teddy));
        System.out.println("-------------------------------------------------------");


        Barbie barbie = new Barbie("Doctor", "Pink", true);
        System.out.println(barbie);
        System.out.println(barbie.hashCode());
        System.out.println("Original:"+System.identityHashCode(barbie));
        System.out.println("-------------------------------------------------------");

        Bean bean = new Bean("Mr. Bean", "Teddy", true);
        System.out.println(bean);
        System.out.println(bean.hashCode());
        System.out.println("Original:"+System.identityHashCode(bean));
        System.out.println("-------------------------------------------------------");


        Dholu dh = new Dholu("Bholu", true, 80);
        System.out.println(dh);
        System.out.println(dh.hashCode());
        System.out.println("Original:"+System.identityHashCode(dh));
        System.out.println("-------------------------------------------------------");


        Kalia k = new Kalia("Bheem", 99, true);
        System.out.println(k);
        System.out.println(k.hashCode());
        System.out.println("Original:"+System.identityHashCode(k));
        System.out.println("-------------------------------------------------------");


        Jaggu jg = new Jaggu("Monkey", "Banana", true);
        System.out.println(jg);
        System.out.println(jg.hashCode());
        System.out.println("Original:"+System.identityHashCode(jg));
        System.out.println("-------------------------------------------------------");


        Unicorn uni = new Unicorn("Sparkle", "White-Pink", true);
        System.out.println(uni);
        System.out.println(uni.hashCode());
        System.out.println("Original:"+System.identityHashCode(uni));
        System.out.println("-------------------------------------------------------");


        Raju rj = new Raju(4, "Sling Shot", true);
        System.out.println(rj);
        System.out.println(rj.hashCode());
        System.out.println("Original:"+System.identityHashCode(rj));
        System.out.println("-------------------------------------------------------");


        Chutki ch = new Chutki("Bheem", "Pink", true);
        System.out.println(ch);
        System.out.println(ch.hashCode());
        System.out.println("Original:"+System.identityHashCode(ch));
        System.out.println("-------------------------------------------------------");


        Bheem bh = new Bheem("Dholakpur", 100, true);
        System.out.println(bh);
        System.out.println(bh.hashCode());
        System.out.println("Original:"+System.identityHashCode(bh));
        System.out.println("-------------------------------------------------------");


        Anime a = new Anime("Attack on Titan", "Eren Yeager", true);
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println("Original:"+System.identityHashCode(a));
        System.out.println("-------------------------------------------------------");


        Cartoon c = new Cartoon("Tom & Jerry", "Cartoon Network", true);
        System.out.println(c);
        System.out.println(c.hashCode());
        System.out.println("Original:"+System.identityHashCode(c));
        System.out.println("-------------------------------------------------------");


        Marvel m = new Marvel("Iron Man", "Powered Armor Suit", true);
        System.out.println(m);
        System.out.println(m.hashCode());
        System.out.println("Original:"+System.identityHashCode(m));
        System.out.println("-------------------------------------------------------");


        Disney d = new Disney("Elsa", "Frozen", true);
        System.out.println(d);
        System.out.println(d.hashCode());
        System.out.println("Original:"+System.identityHashCode(d));
        System.out.println("-------------------------------------------------------");


        Griffin gf = new Griffin("Skyclaw", 4.5, true);
        System.out.println(gf);
        System.out.println(gf.hashCode());
        System.out.println("Original:"+System.identityHashCode(gf));
        System.out.println("-------------------------------------------------------");


        Dragon dr = new Dragon("FireDrake", 95, true);
        System.out.println(dr);
        System.out.println(dr.hashCode());
        System.out.println("Original:"+System.identityHashCode(dr));
        System.out.println("-------------------------------------------------------");


        Phoenix p = new Phoenix("Ashborn", 7, true);
        System.out.println(p);
        System.out.println(p.hashCode());
        System.out.println("Original:"+System.identityHashCode(p));
        System.out.println("-------------------------------------------------------");


        Sneakers sneakers = new Sneakers("Nike", 8, true);
        System.out.println(sneakers);
        System.out.println(sneakers.hashCode());
        System.out.println("Original:"+System.identityHashCode(sneakers));
        System.out.println("-------------------------------------------------------");


        LaptopStand stand = new LaptopStand("Aluminum", true, "Silver");
        System.out.println(stand);
        System.out.println(stand.hashCode());
        System.out.println("Original:"+System.identityHashCode(stand));
        System.out.println("-------------------------------------------------------");


        Keychain keychain = new Keychain("Heart", "Metal", true);
        System.out.println(keychain);
        System.out.println(keychain.hashCode());
        System.out.println("Original:"+System.identityHashCode(keychain));
        System.out.println("-------------------------------------------------------");


        DeskClock clock = new DeskClock("Digital", "Casio", true);
        System.out.println(clock);
        System.out.println(clock.hashCode());
        System.out.println("Original:"+System.identityHashCode(clock));
        System.out.println("-------------------------------------------------------");


        StickyNotes notes = new StickyNotes("Yellow", 100, false);
        System.out.println(notes);
        System.out.println(notes.hashCode());
        System.out.println("Original:"+System.identityHashCode(notes));
        System.out.println("-------------------------------------------------------");


        DeskPlant plant = new DeskPlant("Peace Lily", false, "White");
        System.out.println(plant);
        System.out.println(plant.hashCode());
        System.out.println("Original:"+System.identityHashCode(plant));
        System.out.println("-------------------------------------------------------");


        Sunglasses sunglasses = new Sunglasses("Black", true, "UV400");
        System.out.println(sunglasses);
        System.out.println(sunglasses.hashCode());
        System.out.println("Original:"+System.identityHashCode(sunglasses));
        System.out.println("-------------------------------------------------------");


        Backpack backpack = new Backpack("Wildcraft", 3, true);
        System.out.println(backpack);
        System.out.println(backpack.hashCode());
        System.out.println("Original:"+System.identityHashCode(backpack));
        System.out.println("-------------------------------------------------------");


        Toothbrush brush = new Toothbrush("Colgate", true, "Blue");
        System.out.println(brush);
        System.out.println(brush.hashCode());
        System.out.println("Original:"+System.identityHashCode(brush));
        System.out.println("-------------------------------------------------------");


        WaterBottle bottle = new WaterBottle("Steel", 1000, true);
        System.out.println(bottle);
        System.out.println(bottle.hashCode());
        System.out.println("Original:"+System.identityHashCode(bottle));
        System.out.println("-------------------------------------------------------");


        LunchBox lunch = new LunchBox("Milton", 3, true);
        System.out.println(lunch);
        System.out.println(lunch.hashCode());
        System.out.println("Original:"+System.identityHashCode(lunch));
        System.out.println("-------------------------------------------------------");


        PenStand set= new PenStand("Black", 4, "Round");
        System.out.println(set);
        System.out.println(set.hashCode());
        System.out.println("Original:"+System.identityHashCode(set));
        System.out.println("-------------------------------------------------------");



        DoorMat mat = new DoorMat("Cotton", "Grey", true);
        System.out.println(mat);
        System.out.println(mat.hashCode());
        System.out.println("Original:"+System.identityHashCode(mat));
        System.out.println("-------------------------------------------------------");


        WallClock click = new WallClock("Titan", false, "Square");
        System.out.println(click);
        System.out.println(click.hashCode());
        System.out.println("Original:"+System.identityHashCode(click));
        System.out.println("-------------------------------------------------------");


        Curtain curtain = new Curtain("Silk", 220, "Maroon");
        System.out.println(curtain);
        System.out.println(curtain.hashCode());
        System.out.println("Original:"+System.identityHashCode(curtain));
        System.out.println("-------------------------------------------------------");


        ChoppingBoard board = new ChoppingBoard("Wood", true, "Rectangle");
        System.out.println(board);
        System.out.println(board.hashCode());
        System.out.println("Original:"+System.identityHashCode(board));
        System.out.println("-------------------------------------------------------");


        Dustbin bin = new Dustbin(20, true, "Black");
        System.out.println(bin);
        System.out.println(bin.hashCode());
        System.out.println("Original:"+System.identityHashCode(bin));
        System.out.println("-------------------------------------------------------");


        USBDrive drive = new USBDrive("SanDisk", 64, true);
        System.out.println(drive);
        System.out.println(drive.hashCode());
        System.out.println("Original:"+System.identityHashCode(drive));
        System.out.println("-------------------------------------------------------");


        Webcam web = new Webcam("1080p", true, "Logitech");
        System.out.println(web);
        System.out.println(web.hashCode());
        System.out.println("Original:"+System.identityHashCode(web));
        System.out.println("-------------------------------------------------------");


        WirelessCharger charger = new WirelessCharger("Samsung", 15, true);
        System.out.println(charger);
        System.out.println(charger.hashCode());
        System.out.println("Original:"+System.identityHashCode(charger));
        System.out.println("-------------------------------------------------------");


        Headphones headphones = new Headphones("Over-Ear", true, "Black");
        System.out.println(headphones);
        System.out.println(headphones.hashCode());
        System.out.println("Original:"+System.identityHashCode(headphones));
        System.out.println("-------------------------------------------------------");



        Tripod tripod = new Tripod(150, "Aluminum", true);
        System.out.println(tripod);
        System.out.println(tripod.hashCode());
        System.out.println("Original:"+System.identityHashCode(tripod));
        System.out.println("-------------------------------------------------------");


        Microphone mic = new Microphone("Condenser", true, "Blue Yeti");
        System.out.println(mic);
        System.out.println(mic.hashCode());
        System.out.println("Original:"+System.identityHashCode(mic));
        System.out.println("-------------------------------------------------------");


        LuggageBag bag = new LuggageBag("Safari", 45, true);
        System.out.println(bag);
        System.out.println(bag.hashCode());
        System.out.println("Original:"+System.identityHashCode(bag));
        System.out.println("-------------------------------------------------------");


        Stapler stapler = new Stapler("Kangaroo", 100, false);
        System.out.println(stapler);
        System.out.println(stapler.hashCode());
        System.out.println("Original:"+System.identityHashCode(stapler));
        System.out.println("-------------------------------------------------------");


        PaintBrush paint = new PaintBrush("Medium", "Nylon", true);
        System.out.println(paint);
        System.out.println(paint.hashCode());
        System.out.println("Original:"+System.identityHashCode(paint));
        System.out.println("-------------------------------------------------------");


        DeskLamp lamp = new DeskLamp("White", true, 3);
        System.out.println(lamp);
        System.out.println(lamp.hashCode());
        System.out.println("Original:"+System.identityHashCode(lamp));
        System.out.println("-------------------------------------------------------");

        ShoeRack rack = new ShoeRack(4, "Plastic", true);
        System.out.println(rack);
        System.out.println(rack.hashCode());
        System.out.println("Original:"+System.identityHashCode(rack));
        System.out.println("-------------------------------------------------------");

        WallMirror mirror = new WallMirror("Round", "Wood", 90);
        System.out.println(mirror);
        System.out.println(mirror.hashCode());
        System.out.println("Original:"+System.identityHashCode(mirror));
        System.out.println("-------------------------------------------------------");

        TorchLight torch = new TorchLight("AA", 800, true);
        System.out.println(torch);
        System.out.println(torch.hashCode());
        System.out.println("Original:"+System.identityHashCode(torch));
        System.out.println("-------------------------------------------------------");

        IronBox ironBox = new IronBox("Dry", 750, false);
        System.out.println(ironBox);
        System.out.println(ironBox.hashCode());
        System.out.println("Original:"+System.identityHashCode(ironBox));
        System.out.println("-------------------------------------------------------");

        DishDryer dryer = new DishDryer("LG", 12, true);
        System.out.println(dryer);
        System.out.println(dryer.hashCode());
        System.out.println("Original:"+System.identityHashCode(dryer));
        System.out.println("-------------------------------------------------------");

        ShoePolish polish = new ShoePolish("Black", "Cherry Blossom", true);
        System.out.println(polish);
        System.out.println(polish.hashCode());
        System.out.println("Original:"+System.identityHashCode(polish));
        System.out.println("-------------------------------------------------------");

        IceTray tray = new IceTray(12, "Silicone", true);
        System.out.println(tray);
        System.out.println(tray.hashCode());
        System.out.println("Original:"+System.identityHashCode(tray));
        System.out.println("-------------------------------------------------------");

        ToiletBrush toiletBrush = new ToiletBrush("Nylon", "White", true);
        System.out.println(toiletBrush);
        System.out.println(toiletBrush.hashCode());
        System.out.println("Original:"+System.identityHashCode(toiletBrush));
        System.out.println("-------------------------------------------------------");

        Sanitizer sanitizer = new Sanitizer("Dettol", 200, true);
        System.out.println(sanitizer);
        System.out.println(sanitizer.hashCode());
        System.out.println("Original:"+System.identityHashCode(sanitizer));
        System.out.println("-------------------------------------------------------");

        Whiteboard white= new Whiteboard("Metal", 90, 60);
        System.out.println(white);
        System.out.println(white.hashCode());
        System.out.println("Original:"+System.identityHashCode(white));
        System.out.println("-------------------------------------------------------");

        Coaster coaster = new Coaster("Floral", "Wood", true);
        System.out.println(coaster);
        System.out.println(coaster.hashCode());
        System.out.println("Original:"+System.identityHashCode(coaster));
        System.out.println("-------------------------------------------------------");

    }
}

