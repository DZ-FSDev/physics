/*  Original Licensing Copyright
 * 
 *  Contains all International System of Units constants and definitions.
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
using System;

namespace COM.DZ_FSDev.Physics
{
    /// <summary>
    /// Contains all International System of Units constants and definitions.
    /// </summary>
    public abstract class SIUnit : IUnit
    {
        private int _order;

        /// <summary>
        /// Gets the name of this SIUnit.
        /// </summary>
        public string Name { get; }

        /// <summary>
        /// Gets the symbol of this SIUnit
        /// </summary>
        public string Symbol { get; }

        /// <summary>
        /// Gets the Order of this SIUnit.
        /// </summary>
        public int Order { 
            get { return _order; } 
            private set 
            {
                if (value < 0) throw new ArgumentException("Order cannot be zero.","value");
                _order = value;
            }
        }

        public bool CanAdd(IUnit unit)
        {
            throw new System.NotImplementedException();
        }

        public IUnit DivideBy(IUnit unit)
        {
            throw new System.NotImplementedException();
        }

        public IUnit MultiplyBy(IUnit unit)
        {
            throw new System.NotImplementedException();
        }

        public IUnit Pow(decimal exponent)
        {
            throw new System.NotImplementedException();
        }
    }
}
