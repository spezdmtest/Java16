package org.example.pattern.matching.old.upd;

public interface Spaceship {
    /**
     * Вычисление ожидаемого времени прибытия при помощи instanceof и последущего
     * принудительного приведения объекта к конкретному типу данных
     */
    static double expectedOfArrival(double distance, Spaceship ship) {
        if (ship instanceof BattleCruiser bc) {
            int commonSpeed = bc.getFirstEngine() + bc.getSecondEngine() +
                    bc.getThirdEngine() + bc.getFourthEngine();
            return distance / commonSpeed;

        } else if (ship instanceof Cargo cargo) {
            int commonSpeed = cargo.getFirstEngine() + cargo.getSecondEngine();
            return distance / commonSpeed;
        }
        return 0;
    }
}

class BattleCruiser implements Spaceship {
    private int firstEngine;
    private int secondEngine;
    private int thirdEngine;
    private int fourthEngine;

    public BattleCruiser(int firstEngine, int secondEngine, int thirdEngine, int fourthEngine) {
        this.firstEngine = firstEngine;
        this.secondEngine = secondEngine;
        this.thirdEngine = thirdEngine;
        this.fourthEngine = fourthEngine;
    }

    public int getFirstEngine() {
        return firstEngine;
    }

    public int getSecondEngine() {
        return secondEngine;
    }

    public int getThirdEngine() {
        return thirdEngine;
    }

    public int getFourthEngine() {
        return fourthEngine;
    }
}

class Cargo implements Spaceship {
    private int firstEngine;
    private int secondEngine;

    public Cargo(int firstEngine, int secondEngine) {
        this.firstEngine = firstEngine;
        this.secondEngine = secondEngine;
    }

    public int getFirstEngine() {
        return firstEngine;
    }

    public int getSecondEngine() {
        return secondEngine;
    }
}
