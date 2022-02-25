/*  Original Licensing Copyright
 * 
 *  This interface represents a value which containing measurement units.
 *  Copyright (C) 2021  DZ-FSDev
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
namespace COM.DZ_FSDev.Physics
{
    /// <summary>
    /// The user of this interface should implement a representation
    /// of a mathematical value which contains measurement units.
    /// </summary>
    public interface IUnit
    {
		/// <summary>
		/// Gets and sets the fully qualified name of the unit of measure.
		/// </summary>
		string Name { get; set; }

        /// <summary>
        /// Gets and sets the symbol that represents the unit of measure.
        /// </summary>
		string Symbol { get; set; }

        /// <summary>
        /// Gets and sets the order of this unit of measure.
        /// </summary>
        int Order { get; set; }

        /// <summary>
        /// Returns a new IUnit corresponding to if this IUnit was divided by
	    /// another IUnit.
        /// </summary>
        /// <param name="unit">
        /// The denominating IUnit.
        /// </param>
        /// <returns>
        /// The resulting quotient IUnit.
        /// </returns>
        IUnit DivideBy(IUnit unit);

        /// <summary>
        /// Returns a new IUnit corresponding to if this IUnit was multiplied by
	    /// another IUnit.
        /// </summary>
        /// <param name="unit">
        /// The multiplicand or factor IUnit.
        /// </param>
        /// <returns>
        /// The resulting product IUnit.
        /// </returns>
        IUnit MultiplyBy(IUnit unit);

        /// <summary>
        /// Returns true if this IUnit can be modified in quantity by another
        /// IUnit.
        /// </summary>
        /// <param name="unit">
        /// The other IUnit.
        /// </param>
        /// <returns>
        /// True if this IUnit can be modified in quantity by another IUnit,
        /// false otherwise.
        /// </returns>
        bool CanAdd(IUnit unit);
    }
}
