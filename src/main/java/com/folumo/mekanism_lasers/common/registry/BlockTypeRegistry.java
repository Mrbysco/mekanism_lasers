package com.folumo.mekanism_lasers.common.registry;

import com.folumo.mekanism_lasers.common.block_entity.LaserStopperBlockEntity;
import com.folumo.mekanism_lasers.common.block_entity.OreGeneratorBlockEntity;
import com.folumo.mekanism_lasers.common.block_entity.laser.AdvancedLaserBlockEntity;
import com.folumo.mekanism_lasers.common.block_entity.laser.BasicLaserBlockEntity;
import com.folumo.mekanism_lasers.common.block_entity.laser.EliteLaserBlockEntity;
import com.folumo.mekanism_lasers.common.block_entity.laser.UltimateLaserBlockEntity;
import com.folumo.mekanism_lasers.common.lang.MekanismLasersLang;
import mekanism.common.block.attribute.*;
import mekanism.common.content.blocktype.BlockShapes;
import mekanism.common.content.blocktype.BlockTypeTile;
import mekanism.common.registries.MekanismSounds;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static com.folumo.mekanism_lasers.common.block.BlockShapes.LASER_STOPPER_SHAPE;
import static com.folumo.mekanism_lasers.common.block.BlockShapes.ORE_GENERATOR_SHAPE;

public class BlockTypeRegistry {

    public static final BlockTypeTile<LaserStopperBlockEntity> LASER_STOPPER = BlockTypeTile.BlockTileBuilder.createBlock(() -> BlockEntityTypeRegistry.LASER_STOPPER, MekanismLasersLang.DESCRIPTION_LASER_STOPPER)
            .withCustomShape(LASER_STOPPER_SHAPE)
            .without(AttributeParticleFX.class, AttributeStateFacing.class, Attributes.AttributeRedstone.class)
            .build();

    public static final BlockTypeTile<BasicLaserBlockEntity> BASIC_LASER = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> BlockEntityTypeRegistry.BASIC_LASER, MekanismLasersLang.DESCRIPTION_LASER)
            .withEnergyConfig(BasicLaserBlockEntity::getUsage, BasicLaserBlockEntity::getEnergyCap)
            .withSound(MekanismSounds.LASER)
            .with(Attributes.ACTIVE, new AttributeStateFacing(BlockStateProperties.FACING, AttributeStateFacing.FacePlacementType.SELECTED_FACE), Attributes.SECURITY)
            .withCustomShape(BlockShapes.LASER)
            .build();

    public static final BlockTypeTile<AdvancedLaserBlockEntity> ADVANCED_LASER = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> BlockEntityTypeRegistry.ADVANCED_LASER, MekanismLasersLang.DESCRIPTION_LASER)
            .withEnergyConfig(AdvancedLaserBlockEntity::getUsage, AdvancedLaserBlockEntity::getEnergyCap)
            .withSound(MekanismSounds.LASER)
            .with(Attributes.ACTIVE, new AttributeStateFacing(BlockStateProperties.FACING, AttributeStateFacing.FacePlacementType.SELECTED_FACE), Attributes.SECURITY)
            .withCustomShape(BlockShapes.LASER)
            .build();

    public static final BlockTypeTile<EliteLaserBlockEntity> ELITE_LASER = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> BlockEntityTypeRegistry.ELITE_LASER, MekanismLasersLang.DESCRIPTION_LASER)
            .withEnergyConfig(EliteLaserBlockEntity::getUsage, EliteLaserBlockEntity::getEnergyCap)
            .withSound(MekanismSounds.LASER)
            .with(Attributes.ACTIVE, new AttributeStateFacing(BlockStateProperties.FACING, AttributeStateFacing.FacePlacementType.SELECTED_FACE), Attributes.SECURITY)
            .withCustomShape(BlockShapes.LASER)
            .build();

    public static final BlockTypeTile<UltimateLaserBlockEntity> ULTIMATE_LASER = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> BlockEntityTypeRegistry.ULTIMATE_LASER, MekanismLasersLang.DESCRIPTION_LASER)
            .withEnergyConfig(UltimateLaserBlockEntity::getUsage, UltimateLaserBlockEntity::getEnergyCap)
            .withSound(MekanismSounds.LASER)
            .with(Attributes.ACTIVE, new AttributeStateFacing(BlockStateProperties.FACING, AttributeStateFacing.FacePlacementType.SELECTED_FACE), Attributes.SECURITY)
            .withCustomShape(BlockShapes.LASER)
            .build();

    public static final BlockTypeTile<OreGeneratorBlockEntity> ORE_GENERATOR = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> BlockEntityTypeRegistry.ORE_GENERATOR, MekanismLasersLang.DESCRIPTION_ORE_GENERATOR)
            .withEnergyConfig(OreGeneratorBlockEntity::getUsage, OreGeneratorBlockEntity::getEnergyCap)
            .withSound(MekanismSounds.LASER)
            .withGui(() -> ContainerTypeRegistry.ORE_GENERATOR)
            .with(Attributes.ACTIVE, new AttributeStateFacing(BlockStateProperties.FACING, AttributeStateFacing.FacePlacementType.SELECTED_FACE), Attributes.SECURITY)
            .withCustomShape(ORE_GENERATOR_SHAPE)
            .build();


}