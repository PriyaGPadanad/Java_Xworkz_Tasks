package com.xworkz.interfaces.defaultmain;

import com.xworkz.interfaces.defaultimpli.*;
import com.xworkz.interfaces.defaultinterface.*;

public class InterfaceRunner {
    Toaster toaster= (Toaster) new SmartToaster();
    toaster.toast();

    COffeeGrinder grinder=new ElectricGrinder();
    grinder.grind();

    RiceCooker cooker=new AutoRiceCooker();
    cooker.cookRice();

    ElectricKettle kettle=new AutoKettle();
    kettle.boil();

    PopcornMaker popcorn=new MoviePopcornMaker();
    popcorn.pop();

    EggBoiler egg=new SmartEggBoiler();
    egg.boilEggs();

    ElectricTandoor tandoor=new MiniTandoor();
    tandoor.grill();

    WaffleMaker waffle=new BelgianWaffleMaker();
    waffle.makeWaffle();

    FoodDehydrator dehydrate=new FruitDehydrator();
    dehydrator.dehydrate();

    MilkFrother frother=new AutomaticFrother();
    frother.froth();

    BreadMaker breadMaker = new DigitalBreadMaker();
breadMaker.bakeBread();

    InductionCooktop cooktop = new SmartCooktop();
cooktop.heat();

    IceCreamMaker iceMaker = new SoftServeMaker();
iceMaker.freeze();

    ElectricPeeler peeler = new AutoPeeler();
peeler.peel();

    RotiMaker roti = new AutoRotiMaker();
roti.makeRoti();

    OilDispenser oil = new SmartDispenser();
oil.dispense();

    Chopper chopper = new PowerChopper();
chopper.chop();

    HandMixer mixer = new TurboMixer();
mixer.mix();

    NutGrinder nutGrinder = new ProNutGrinder();
nutGrinder.grindNuts();

    SousVide sousVide = new DigitalSousVide();
sousVide.cookSousVide();

    ElectricSteamer steamer = new SmartSteamer();
steamer.steam();

    YogurtMaker yogurt = new AutoYogurtMaker();
yogurt.ferment();

    ElectricGrill grill = new MultiGrill();
grill.grillFood();

    SoupMaker soup = new AutoSoupMaker();
soup.makeSoup();

    ElectricSlicer slicer = new AdjustableSlicer();
slicer.slice();

    DigitalThermometer thermometer = new CookingThermometer();
thermometer.measure();

    SpiceGrinder spiceGrinder = new FineSpiceGrinder();
spiceGrinder.grindSpices();

    KitchenScale scale = new DigitalKitchenScale();
scale.weigh();

    ElectricOpener opener = new JarOpener();
opener.open();

    PortableBlender blender = new USBBlender();
blender.blend();

}
