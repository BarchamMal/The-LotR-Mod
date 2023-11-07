package barch.the_lotr_mod.Metals;

import barch.the_lotr_mod.Metals.Bronze.BronzeMaterial;
import barch.the_lotr_mod.Metals.Copper.CopperMaterial;
import barch.the_lotr_mod.Metals.ElvenSteel.ElvenSteelMaterial;
import barch.the_lotr_mod.Metals.Iron.IronMaterial;
import barch.the_lotr_mod.Metals.OrcSteel.OrcSteelMaterial;
import barch.the_lotr_mod.Metals.Tin.TinMaterial;

public class Reg {

    public static final CopperMaterial COPPER_MATERIAL = new CopperMaterial();
    public static final IronMaterial IRON_MATERIAL = new IronMaterial();
    public static final TinMaterial TIN_MATERIAL = new TinMaterial();
    public static final BronzeMaterial BRONZE_MATERIAL = new BronzeMaterial();
    public static final OrcSteelMaterial ORC_STEEL_MATERIAL = new OrcSteelMaterial();
    public static final ElvenSteelMaterial ELVEN_STEEL_MATERIAL = new ElvenSteelMaterial();

    public static final Gems GEMS = new Gems();



    public static void Register() {

        COPPER_MATERIAL.RegisterAll();
        IRON_MATERIAL.RegisterAll();
        TIN_MATERIAL.RegisterAll();
        BRONZE_MATERIAL.RegisterAll();
        ORC_STEEL_MATERIAL.RegisterAll();
        ELVEN_STEEL_MATERIAL.RegisterAll();

        GEMS.RegisterAll();

    }

}
