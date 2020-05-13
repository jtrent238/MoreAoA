package com.jtrent238.moreaoa.items.lootboxes;

import java.util.List;

import javax.annotation.Nullable;

import com.jtrent238.moreaoa.util.RegistryHandler;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.utils.LootUtil;
import net.tslat.aoa3.utils.StringUtil;

public class RealmstoneBag extends Item {
	public RealmstoneBag() {
		//setTranslationKey("RealmstoneBag");
		setRegistryName("aoa3:realmstone_bag");
		setCreativeTab(CreativeTabsRegister.miscTab);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			LootUtil.generateAndProvideLootDirectly((EntityPlayerMP)player, RegistryHandler.RealmstonebagLoot);

			if (!player.capabilities.isCreativeMode)
				player.getHeldItem(hand).shrink(1);

			player.inventoryContainer.detectAndSendChanges();
		}

		return EnumActionResult.PASS;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(StringUtil.getColourLocaleString("item.RealmstoneBag.desc.1", TextFormatting.GOLD));
	}
}