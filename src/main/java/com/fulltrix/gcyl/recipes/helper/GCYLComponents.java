package com.fulltrix.gcyl.recipes.helper;

import com.fulltrix.gcyl.item.GCYLCoreItems;
import gregtech.api.GTValues;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.loaders.recipe.CraftingComponent;

import static com.fulltrix.gcyl.materials.GCYLMaterials.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.loaders.recipe.CraftingComponent.Component;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//TODO Finish cables
public class GCYLComponents {
    public static Component PLATE_DENSE;
    public static Component CABLE_DOUBLE;
    public static Component GEAR;

    public static Component SUPERCONDUCTOR_WIRE;

    public static void initializeComponents() {

        // Wires

        SUPERCONDUCTOR_WIRE = new Component(Stream.of(new Object[][]{

                {1, new UnificationEntry(wireGtSingle, LVSuperconductor)},
                {2, new UnificationEntry(wireGtSingle, MVSuperconductor)},
                {3, new UnificationEntry(wireGtSingle, HVSuperconductor)},
                {4, new UnificationEntry(wireGtSingle, EVSuperconductor)},
                {5, new UnificationEntry(wireGtSingle, IVSuperconductor)},
                {6, new UnificationEntry(wireGtSingle, LuVSuperconductor)},
                {7, new UnificationEntry(wireGtSingle, ZPMSuperconductor)},
                {8, new UnificationEntry(wireGtSingle, UVSuperconductor)},
                {9, new UnificationEntry(wireGtSingle, UHVSuperconductor)},
                {10, new UnificationEntry(wireGtSingle, UEVSuperconductor)},
                {11, new UnificationEntry(wireGtSingle, UIVSuperconductor)},
                {12, new UnificationEntry(wireGtSingle, UXVSuperconductor)},
                {13, new UnificationEntry(wireGtSingle, OpVSuperconductor)},
                {14, new UnificationEntry(wireGtSingle, MAXSuperconductor)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.WIRE_QUAD = new Component(Stream.of(new Object[][] {

                { 0, new UnificationEntry(wireGtQuadruple, Materials.RedAlloy) },
                { 1, new UnificationEntry(wireGtQuadruple, Materials.Tin) },
                { 2, new UnificationEntry(wireGtQuadruple, Materials.Copper) },
                { 3, new UnificationEntry(wireGtQuadruple, Materials.Gold) },
                { 4, new UnificationEntry(wireGtQuadruple, Materials.Aluminium) },
                { 5, new UnificationEntry(wireGtQuadruple, Platinum) },
                { 6, new UnificationEntry(wireGtQuadruple, Materials.NiobiumTitanium) },
                { 7, new UnificationEntry(wireGtQuadruple, Materials.Naquadah) },
                { 8, new UnificationEntry(wireGtQuadruple, Materials.NaquadahAlloy) },
                { 9, new UnificationEntry(wireGtQuadruple, TungstenTitaniumCarbide) },
                {10, new UnificationEntry(wireGtQuadruple, TitanSteel)},
                {11, new UnificationEntry(wireGtQuadruple, BlackTitanium)},
                {12, new UnificationEntry(wireGtQuadruple, NaquadriaticTaranium)},
                {13, new UnificationEntry(wireGtQuadruple, Neutronium)},
                {14, new UnificationEntry(wireGtQuadruple, CosmicNeutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.WIRE_HEX = new Component(Stream.of(new Object[][]{

                {0, new UnificationEntry(wireGtHex, Lead)},
                {1, new UnificationEntry(wireGtHex, Tin)},
                {2, new UnificationEntry(wireGtHex, Copper)},
                {3, new UnificationEntry(wireGtHex, Gold)},
                {4, new UnificationEntry(wireGtHex, Aluminium)},
                {5, new UnificationEntry(wireGtHex, Platinum)},
                {6, new UnificationEntry(wireGtHex, NiobiumTitanium)},
                {7, new UnificationEntry(wireGtHex, Naquadah)},
                {8, new UnificationEntry(wireGtHex, NaquadahAlloy)},
                {9, new UnificationEntry(wireGtHex, AbyssalAlloy)},
                {10, new UnificationEntry(wireGtHex, TitanSteel)},
                {11, new UnificationEntry(wireGtHex, BlackTitanium)},
                {12, new UnificationEntry(wireGtHex, NaquadriaticTaranium)},
                {13, new UnificationEntry(wireGtHex, Neutronium)},
                {14, new UnificationEntry(wireGtHex, CosmicNeutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.WIRE_OCT = new Component(Stream.of(new Object[][] {

                { 0, new UnificationEntry(wireGtOctal, Materials.RedAlloy) },
                { 1, new UnificationEntry(wireGtOctal, Materials.Tin) },
                { 2, new UnificationEntry(wireGtOctal, Materials.Copper) },
                { 3, new UnificationEntry(wireGtOctal, Materials.Gold) },
                { 4, new UnificationEntry(wireGtOctal, Materials.Aluminium) },
                { 5, new UnificationEntry(wireGtOctal, Materials.Platinum) },
                { 6, new UnificationEntry(wireGtOctal, Materials.NiobiumTitanium) },
                { 7, new UnificationEntry(wireGtOctal, Naquadah) },
                { 8, new UnificationEntry(wireGtOctal, NaquadahAlloy) },
                { 9, new UnificationEntry(wireGtOctal, TungstenTitaniumCarbide) },
                {10, new UnificationEntry(wireGtOctal, TitanSteel)},
                {11, new UnificationEntry(wireGtOctal, BlackTitanium)},
                {12, new UnificationEntry(wireGtOctal, NaquadriaticTaranium)},
                {13, new UnificationEntry(wireGtOctal, Neutronium)},
                {14, new UnificationEntry(wireGtOctal, CosmicNeutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        // Cables

        CraftingComponent.CABLE = new Component(Stream.of(new Object[][] {

                { 0, new UnificationEntry(cableGtSingle, Materials.RedAlloy) },
                { 1, new UnificationEntry(cableGtSingle, Materials.Tin) },
                { 2, new UnificationEntry(cableGtSingle, Materials.Copper) },
                { 3, new UnificationEntry(cableGtSingle, Materials.Gold) },
                { 4, new UnificationEntry(cableGtSingle, Materials.Aluminium) },
                { 5, new UnificationEntry(cableGtSingle, Platinum) },
                { 6, new UnificationEntry(cableGtSingle, Materials.NiobiumTitanium) },
                { 7, new UnificationEntry(cableGtSingle, Materials.Naquadah) },
                { 8, new UnificationEntry(cableGtSingle, Materials.NaquadahAlloy) },
                { 9, new UnificationEntry(cableGtSingle, TungstenTitaniumCarbide) },
                {10, new UnificationEntry(cableGtSingle, TitanSteel)},
                {11, new UnificationEntry(cableGtSingle, BlackTitanium)},
                {12, new UnificationEntry(cableGtSingle, NaquadriaticTaranium)},
                {13, new UnificationEntry(cableGtSingle, Neutronium)},
                {14, new UnificationEntry(cableGtSingle, CosmicNeutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CABLE_DOUBLE = new Component(Stream.of(new Object[][]{

                {0, new UnificationEntry(cableGtDouble, Lead)},
                {1, new UnificationEntry(cableGtDouble, Tin)},
                {2, new UnificationEntry(cableGtDouble, Copper)},
                {3, new UnificationEntry(cableGtDouble, Gold)},
                {4, new UnificationEntry(cableGtDouble, Aluminium)},
                {5, new UnificationEntry(cableGtDouble, Platinum)},
                {6, new UnificationEntry(cableGtDouble, NiobiumTitanium)},
                {7, new UnificationEntry(cableGtDouble, Naquadah)},
                {8, new UnificationEntry(cableGtDouble, NaquadahAlloy)},
                {9, new UnificationEntry(cableGtDouble, AbyssalAlloy)},
                {10, new UnificationEntry(cableGtDouble, TitanSteel)},
                {11, new UnificationEntry(cableGtDouble, BlackTitanium)},
                {12, new UnificationEntry(cableGtDouble, NaquadriaticTaranium)},
                {13, new UnificationEntry(cableGtDouble, Neutronium)},
                {14, new UnificationEntry(cableGtDouble, CosmicNeutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.CABLE_QUAD = new Component(Stream.of(new Object[][] {

                { 0, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.RedAlloy) },
                { 1, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Tin) },
                { 2, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Copper) },
                { 3, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Gold) },
                { 4, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Aluminium) },
                { 5, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Platinum) },
                { 6, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium) },
                { 7, new UnificationEntry(OrePrefix.cableGtQuadruple, Naquadah) },
                { 8, new UnificationEntry(OrePrefix.cableGtQuadruple, NaquadahAlloy) },
                { 9, new UnificationEntry(OrePrefix.cableGtQuadruple, TungstenTitaniumCarbide) },
                {10, new UnificationEntry(cableGtQuadruple, TitanSteel)},
                {11, new UnificationEntry(cableGtQuadruple, BlackTitanium)},
                {12, new UnificationEntry(cableGtQuadruple, NaquadriaticTaranium)},
                {13, new UnificationEntry(cableGtQuadruple, Neutronium)},
                {14, new UnificationEntry(cableGtQuadruple, CosmicNeutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.CABLE_OCT = new Component(Stream.of(new Object[][] {

                { 0, new UnificationEntry(OrePrefix.cableGtOctal, Materials.RedAlloy) },
                { 1, new UnificationEntry(OrePrefix.cableGtOctal, Materials.Tin) },
                { 2, new UnificationEntry(OrePrefix.cableGtOctal, Materials.Copper) },
                { 3, new UnificationEntry(OrePrefix.cableGtOctal, Materials.Gold) },
                { 4, new UnificationEntry(OrePrefix.cableGtOctal, Materials.Aluminium) },
                { 5, new UnificationEntry(OrePrefix.cableGtOctal, Materials.Platinum) },
                { 6, new UnificationEntry(OrePrefix.cableGtOctal, Materials.NiobiumTitanium) },
                { 7, new UnificationEntry(OrePrefix.cableGtOctal, Naquadah) },
                { 8, new UnificationEntry(OrePrefix.cableGtOctal, NaquadahAlloy) },
                { 9, new UnificationEntry(OrePrefix.cableGtOctal, TungstenTitaniumCarbide) },

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.CABLE_HEX = new Component(Stream.of(new Object[][] {

                { 0, new UnificationEntry(OrePrefix.cableGtHex, Materials.RedAlloy) },
                { 1, new UnificationEntry(OrePrefix.cableGtHex, Materials.Tin) },
                { 2, new UnificationEntry(OrePrefix.cableGtHex, Materials.Copper) },
                { 3, new UnificationEntry(OrePrefix.cableGtHex, Materials.Gold) },
                { 4, new UnificationEntry(OrePrefix.cableGtHex, Materials.Aluminium) },
                { 5, new UnificationEntry(OrePrefix.cableGtHex, Materials.Platinum) },
                { 6, new UnificationEntry(OrePrefix.cableGtHex, Materials.NiobiumTitanium) },
                { 7, new UnificationEntry(OrePrefix.cableGtHex, Naquadah) },
                { 8, new UnificationEntry(OrePrefix.cableGtHex, NaquadahAlloy) },
                { 9, new UnificationEntry(OrePrefix.cableGtHex, TungstenTitaniumCarbide) },

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.CABLE_TIER_UP = new Component(Stream.of(new Object[][] {

                { 0, new UnificationEntry(OrePrefix.cableGtSingle, Materials.Tin) },
                { 1, new UnificationEntry(OrePrefix.cableGtSingle, Materials.Copper) },
                { 2, new UnificationEntry(OrePrefix.cableGtSingle, Materials.Gold) },
                { 3, new UnificationEntry(OrePrefix.cableGtSingle, Materials.Aluminium) },
                { 4, new UnificationEntry(OrePrefix.cableGtSingle, Materials.Platinum) },
                { 5, new UnificationEntry(OrePrefix.cableGtSingle, Materials.NiobiumTitanium) },
                { 6, new UnificationEntry(OrePrefix.cableGtSingle, Naquadah) },
                { 7, new UnificationEntry(OrePrefix.cableGtSingle, NaquadahAlloy) },
                { 8, new UnificationEntry(OrePrefix.cableGtSingle, TungstenTitaniumCarbide) },
                {9, new UnificationEntry(cableGtQuadruple, TitanSteel)},
                {10, new UnificationEntry(cableGtQuadruple, BlackTitanium)},
                {11, new UnificationEntry(cableGtQuadruple, NaquadriaticTaranium)},
                {12, new UnificationEntry(cableGtQuadruple, Neutronium)},
                {13, new UnificationEntry(cableGtQuadruple, CosmicNeutronium)},
                { GTValues.FALLBACK, new UnificationEntry(OrePrefix.cableGtSingle, Materials.Europium) },

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.CABLE_QUAD_TIER_UP = new Component(Stream.of(new Object[][] {

                { 0, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Tin) },
                { 1, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Copper) },
                { 2, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Gold) },
                { 3, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Aluminium) },
                { 4, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Platinum) },
                { 5, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.NiobiumTitanium) },
                { 6, new UnificationEntry(OrePrefix.cableGtQuadruple, Naquadah) },
                { 7, new UnificationEntry(OrePrefix.cableGtQuadruple, NaquadahAlloy) },
                { 8, new UnificationEntry(OrePrefix.cableGtQuadruple, TungstenTitaniumCarbide) },
                {9, new UnificationEntry(cableGtQuadruple, TitanSteel)},
                {10, new UnificationEntry(cableGtQuadruple, BlackTitanium)},
                {11, new UnificationEntry(cableGtQuadruple, NaquadriaticTaranium)},
                {12, new UnificationEntry(cableGtQuadruple, Neutronium)},
                {13, new UnificationEntry(cableGtQuadruple, CosmicNeutronium)},
                { GTValues.FALLBACK, new UnificationEntry(OrePrefix.cableGtQuadruple, Materials.Europium) },

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        // Plates

        CraftingComponent.PLATE = new Component(Stream.of(new Object[][] {

                {0, new UnificationEntry(plate, Lead)},
                {1, new UnificationEntry(plate, Steel)},
                {2, new UnificationEntry(plate, Aluminium)},
                {3, new UnificationEntry(plate, StainlessSteel)},
                {4, new UnificationEntry(plate, Titanium)},
                {5, new UnificationEntry(plate, TungstenSteel)},
                {6, new UnificationEntry(plate, RhodiumPlatedPalladium)},
                {7, new UnificationEntry(plate, Duranium)},
                {8, new UnificationEntry(plate, Tritanium)},
                {9, new UnificationEntry(plate, Seaborgium)},
                {10, new UnificationEntry(plate, Bohrium)},
                {11, new UnificationEntry(plate, Quantum)},
                {12, new UnificationEntry(plate, BlackTitanium)},
                {13, new UnificationEntry(plate, HeavyQuarkDegenerateMatter)},
                {14, new UnificationEntry(plate, Neutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        PLATE_DENSE = new Component(Stream.of(new Object[][]{

                {1, new UnificationEntry(plateDense, Steel)},
                {2, new UnificationEntry(plateDense, Aluminium)},
                {3, new UnificationEntry(plateDense, StainlessSteel)},
                {4, new UnificationEntry(plateDense, Titanium)},
                {5, new UnificationEntry(plateDense, TungstenSteel)},
                {6, new UnificationEntry(plateDense, RhodiumPlatedPalladium)},
                {7, new UnificationEntry(plateDense, HSSS)},
                {8, new UnificationEntry(plateDense, Tritanium)},
                {9, new UnificationEntry(plateDense, Seaborgium)},
                {10, new UnificationEntry(plateDense, Bohrium)},
                {11, new UnificationEntry(plateDense, Quantum)},
                {12, new UnificationEntry(plate, BlackTitanium)},
                {13, new UnificationEntry(plate, HeavyQuarkDegenerateMatter)},
                {14, new UnificationEntry(plate, Neutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        // Misc

        GEAR = new Component(Stream.of(new Object[][]{

                {1, new UnificationEntry(gear, Steel)},
                {2, new UnificationEntry(gear, Aluminium)},
                {3, new UnificationEntry(gear, StainlessSteel)},
                {4, new UnificationEntry(gear, Titanium)},
                {5, new UnificationEntry(gear, TungstenSteel)},
                {6, new UnificationEntry(gear, RhodiumPlatedPalladium)},
                {7, new UnificationEntry(gear, HSSS)},
                {8, new UnificationEntry(gear, Tritanium)},
                {9, new UnificationEntry(gear, Seaborgium)},
                {10, new UnificationEntry(gear, Bohrium)},
                {11, new UnificationEntry(gear, Quantum)},
                {12, new UnificationEntry(gear, Neutronium)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CraftingComponent.VOLTAGE_COIL.appendIngredients(Stream.of(new Object[][] {

                {9, GCYLCoreItems.VOLTAGE_COIL_UHV},
                {10, GCYLCoreItems.VOLTAGE_COIL_UEV},
                {11, GCYLCoreItems.VOLTAGE_COIL_UIV},
                {12, GCYLCoreItems.VOLTAGE_COIL_UXV},
                {13, GCYLCoreItems.VOLTAGE_COIL_OpV},
                {14, GCYLCoreItems.VOLTAGE_COIL_MAX},

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));


        CraftingComponent.POWER_COMPONENT.appendIngredients(Stream.of(new Object[][] {

                {9, GCYLCoreItems.NPIC},
                {10, GCYLCoreItems.NPIC},
                {11, GCYLCoreItems.PPIC},
                {12, GCYLCoreItems.PPIC},
                {13, GCYLCoreItems.QPIC},
                {14, GCYLCoreItems.QPIC},

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

    }
}



    /*
    COMPONENT = new Component(Stream.of(new Object[][] {

                {0,)},
                {1,)},
                {2,)},
                {3,)},
                {4,)},
                {5,)},
                {6,)},
                {7,)},
                {8,)},
                {9,)},
                {10,)},
                {11,)},
                {12,)},
                {13,)},
                {14,)},

     }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));
     */


