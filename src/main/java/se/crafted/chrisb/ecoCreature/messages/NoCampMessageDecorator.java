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
package se.crafted.chrisb.ecoCreature.messages;

public class NoCampMessageDecorator extends AbstractMessageDecorator
{
    private boolean spawnerCampMessageEnabled;

    public NoCampMessageDecorator(Message decoratedMessage)
    {
        super(decoratedMessage);
        spawnerCampMessageEnabled = false;
    }

    public boolean isSpawnerCampMessageEnabled()
    {
        return spawnerCampMessageEnabled;
    }

    public void setSpawnerCampMessageEnabled(boolean spawnerCampMessageEnabled)
    {
        this.spawnerCampMessageEnabled = spawnerCampMessageEnabled;
    }

    @Override
    public boolean isMessageOutputEnabled()
    {
        return spawnerCampMessageEnabled && super.isMessageOutputEnabled();
    }
}
