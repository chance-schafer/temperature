package org.launchcode.temperature;

public enum Scale {
    KELVIN {
        @Override
        public String toString() {
            return "K";
        }
    },

    CELSIUS {
        @Override
        public String toString() {
            return "C";
        }
    },

    FAHRENHEIT {
        @Override
        public String toString() {
            return "F";
        }
    };
}
