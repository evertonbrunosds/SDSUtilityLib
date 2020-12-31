/*
 * This file is part of the SDSJavaLibs Open Source Project.
 * SDSJavaLibs is licensed under the GNU GPLv3.
 *
 * Copyright © 2020. Everton Bruno Silva dos Santos <evertonbrunogithub@yahoo.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package evertonbrunosds.api;

import java.io.Serializable;

/**
 * Interface responsável por fornecer a assinatura de método de um trabalhador.
 * @author Everton Bruno Silva dos Santos.
 * @version 1.0
 */
@FunctionalInterface
public interface Worker extends Serializable {

    /**
     * Método responsável por trabalhar.
     */
    void work();

}
