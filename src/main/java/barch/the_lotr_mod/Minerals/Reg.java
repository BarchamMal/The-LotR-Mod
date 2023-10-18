package barch.the_lotr_mod.Minerals;

import barch.the_lotr_mod.Minerals.Bronze.BronzeMaterial;
import barch.the_lotr_mod.Minerals.Copper.CopperMaterial;
import barch.the_lotr_mod.Minerals.Iron.IronMaterial;
import barch.the_lotr_mod.Minerals.Tin.TinMaterial;

public class Reg {

    public static final CopperMaterial COPPER_MATERIAL = new CopperMaterial();
    public static final IronMaterial IRON_MATERIAL = new IronMaterial();
    public static final TinMaterial TIN_MATERIAL = new TinMaterial();
    public static final BronzeMaterial BRONZE_MATERIAL = new BronzeMaterial();

    public static final Gems GEMS = new Gems();



    public static void Register() {

        COPPER_MATERIAL.RegisterAll();
        IRON_MATERIAL.RegisterAll();
        TIN_MATERIAL.RegisterAll();
        BRONZE_MATERIAL.RegisterAll();

        GEMS.RegisterAll();

    }

}
