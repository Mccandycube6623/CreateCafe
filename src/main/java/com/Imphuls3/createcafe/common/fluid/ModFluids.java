package com.Imphuls3.createcafe.common.fluid;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.item.ModCreativeModeTab;
import com.simibubi.create.repack.registrate.Registrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import com.simibubi.create.repack.registrate.util.entry.FluidEntry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("all")
public class ModFluids {
    public static final Registrate REGISTRATE = Registrate.create(CreateCafe.MOD_ID)
            .creativeModeTab(() -> ModCreativeModeTab.CREATE_CAFE);

    public static final ResourceLocation FLUID_STILL_RL = new ResourceLocation("createcafe:fluid/milk_tea_still");
    public static final ResourceLocation FLUID_FLOWING_RL = new ResourceLocation("createcafe:fluid/milk_tea_flow");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateCafe.MOD_ID);

    public static FluidEntry<ForgeFlowingFluid.Flowing> MELTED_SUGAR =
            REGISTRATE.fluid("melted_sugar", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.melted_sugar", "Melted Sugar")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8fff7e0))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> FILLING =
            REGISTRATE.fluid("filling", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.filling", "Filling")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ededed))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> OREO_TEA =
            REGISTRATE.fluid("oreo_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.oreo_tea", "Oreo Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8dedad3))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> MANGO_TEA =
            REGISTRATE.fluid("mango_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.mango_tea", "Mango Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8fcc03d))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> LIME_TEA =
            REGISTRATE.fluid("lime_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.lime_tea", "Lime Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8b3ff26))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> LYCHEE_TEA =
            REGISTRATE.fluid("lychee_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.lychee_tea", "Lychee Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ff9a96))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> KIWI_TEA =
            REGISTRATE.fluid("kiwi_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.kiwi_tea", "Kiwi Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc894fc90))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> MANA_TEA =
            REGISTRATE.fluid("mana_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.mana_tea", "Mana Berry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc817e4ff))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BLOOD_TEA =
            REGISTRATE.fluid("blood_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.blood_tea", "Blood Orange Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8fc3003))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> LEMON_TEA =
            REGISTRATE.fluid("lemon_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.lemon_tea", "Lemon Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ffe645))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> WATERMELON_TEA =
            REGISTRATE.fluid("watermelon_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.watermelon_tea", "Watermelon Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8b83b56))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> STRAWBERRY_TEA =
            REGISTRATE.fluid("strawberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.strawberry_tea", "Strawberry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ffa6b8))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BLUEBERRY_TEA =
            REGISTRATE.fluid("blueberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.blueberry_tea", "Blueberry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc89f8cff))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> VANILLA_TEA =
            REGISTRATE.fluid("vanilla_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.vanilla_tea", "Vanilla Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ede6d8))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> ORANGE_TEA =
            REGISTRATE.fluid("orange_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.orange_tea", "Orange Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8de9c33))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PEACH_TEA =
            REGISTRATE.fluid("peach_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.peach_tea", "Peach Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8edc29f))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PINEAPPLE_TEA =
            REGISTRATE.fluid("pineapple_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.pineapple_tea", "Pineapple Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ffd752))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BANANA_TEA =
            REGISTRATE.fluid("banana_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.banana_tea", "Banana Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ffe79e))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> YUCCA_TEA =
            REGISTRATE.fluid("yucca_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.yucca_tea", "Yucca Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8c8f25e))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> CHERRY_TEA =
            REGISTRATE.fluid("cherry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.cherry_tea", "Cherry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8c7445e))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PLUM_TEA =
            REGISTRATE.fluid("plum_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.plum_tea", "Plum Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ffb8f5))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> ALOE_TEA =
            REGISTRATE.fluid("aloe_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.aloe_tea", "Aloe Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc898de52))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> APPLE_TEA =
            REGISTRATE.fluid("apple_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.apple_tea", "Apple Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8fceb77))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BLACKBERRY_TEA =
            REGISTRATE.fluid("blackberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.blackberry_tea", "Blackberry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8875284))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PUMPKIN_TEA =
            REGISTRATE.fluid("pumpkin_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.pumpkin_tea", "Pumpkin Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8f7e0ad))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> JACKFRUIT_TEA =
            REGISTRATE.fluid("jackfruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.jackfruit_tea", "Jackfruit Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8f5cc71))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> COCONUT_TEA =
            REGISTRATE.fluid("coconut_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.coconut_tea", "Coconut Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8fcf9e3))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> DRAGONFRUIT_TEA =
            REGISTRATE.fluid("dragonfruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.dragonfruit_tea", "Dragonfruit Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ff1f8f))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> APRICOT_TEA =
            REGISTRATE.fluid("apricot_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.apricot_tea", "Apricot Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8ffcb94))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> AVOCADO_TEA =
            REGISTRATE.fluid("avocado_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.avocado_tea", "Avocado Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc896b366))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> SWEETBERRY_TEA =
            REGISTRATE.fluid("sweetberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.sweetberry_tea", "Sweetberry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8db2e48))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> DURIAN_TEA =
            REGISTRATE.fluid("durian_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.durian_tea", "Durian Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8F4C672))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> FIG_TEA =
            REGISTRATE.fluid("fig_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.fig_tea", "Fig Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8773C65))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> TAMARIND_TEA =
            REGISTRATE.fluid("tamarind_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.tamarind_tea", "Tamarind Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FFBD7F))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> GOOSEBERRY_TEA =
            REGISTRATE.fluid("gooseberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.gooseberry_tea", "Gooseberry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FCD946))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> GRAPE_TEA =
            REGISTRATE.fluid("grape_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.grape_tea", "Grape Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8EA77C8))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> GRAPEFRUIT_TEA =
            REGISTRATE.fluid("grapefruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.grapefruit_tea", "Grapefruit Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FF8060))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PAPAYA_TEA =
            REGISTRATE.fluid("papaya_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.papaya_tea", "Papaya Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FFB163))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> GUAVA_TEA =
            REGISTRATE.fluid("guava_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.guava_tea", "Guava Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FF835B))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PASSIONFRUIT_TEA =
            REGISTRATE.fluid("passionfruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.passionfruit_tea", "Passionfruit Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FECC35))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> POMEGRANATE_TEA =
            REGISTRATE.fluid("pomegranate_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.pomegranate_tea", "Pomegranate Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8BA485B))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PERSIMMON_TEA =
            REGISTRATE.fluid("persimmon_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.persimmon_tea", "Persimmon Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8E89166))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> RASPBERRY_TEA =
            REGISTRATE.fluid("raspberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.raspberry_tea", "Raspberry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FF7D7D))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> STARFRUIT_TEA =
            REGISTRATE.fluid("starfruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.starfruit_tea", "Starfruit Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FFDA65))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> LAVENDER_TEA =
            REGISTRATE.fluid("lavender_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.lavender_tea", "Lavender Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8deaef2))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> POMELO_TEA =
            REGISTRATE.fluid("pomelo_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.pomelo_tea", "Pomelo Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FF6F4C))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> MANDARIN_TEA =
            REGISTRATE.fluid("mandarin_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.mandarin_tea", "Mandarin Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FFC216))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> CITRON_TEA =
            REGISTRATE.fluid("citron_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.citron_tea", "Citron Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8FFC300))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> REDLOVE_TEA =
            REGISTRATE.fluid("redlove_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.redlove_tea", "Redlove Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8E24F63))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BARBERRY_TEA =
            REGISTRATE.fluid("barberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.barberry_tea", "Barberry Milk Tea")
                    .attributes(b -> b.viscosity(1000)
                            .density(1400)
                            .color(0xc8a1153c))
                    .properties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static void register(IEventBus eventBus){
        FLUIDS.register(eventBus);
    }
}
