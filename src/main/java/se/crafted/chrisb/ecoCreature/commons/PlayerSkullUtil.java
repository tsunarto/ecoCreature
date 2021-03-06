/*
 * This file is part of ecoCreature.
 *
 * Copyright (c) 2011-2012, R. Ramos <http://github.com/mung3r/>
 * ecoCreature is licensed under the GNU Lesser General Public License.
 *
 * ecoCreature is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ecoCreature is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.crafted.chrisb.ecoCreature.commons;

import net.minecraft.server.ItemStack;
import net.minecraft.server.NBTTagCompound;

import org.bukkit.craftbukkit.inventory.CraftItemStack;

public final class PlayerSkullUtil
{
    private PlayerSkullUtil()
    {
    }

    public static CraftItemStack createPlayerSkull(String playerName)
    {
        CraftItemStack craftHeadItem = new CraftItemStack(397, 1, (short) 0, (byte) 3);
        ItemStack headItem = craftHeadItem.getHandle();
        NBTTagCompound tag = new NBTTagCompound();
        tag.setString("SkullOwner", playerName);
        headItem.tag = tag;
        return craftHeadItem;
    }
}
