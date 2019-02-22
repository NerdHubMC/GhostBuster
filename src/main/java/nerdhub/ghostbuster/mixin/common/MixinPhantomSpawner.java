/*
 * GhostBuster
 * Copyright (C) 2019 NerdHubMC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses>.
 */
package nerdhub.ghostbuster.mixin.common;

import net.minecraft.world.World;
import net.minecraft.world.gen.PhantomSpawner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = PhantomSpawner.class, priority = 500)
public abstract class MixinPhantomSpawner {

    @Inject(method = "spawn", at = @At("HEAD"), cancellable = true)
    private void spawn(World world, boolean boolean_1, boolean boolean_2, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}
