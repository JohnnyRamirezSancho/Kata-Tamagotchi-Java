package com.kata;

public class Tamagotchi {
    
    private int mood = 4;
    private int hunger = 4;
    private int energy = 4;
    private String faceActual;
    private String faceNormal = ":-|";
    private String faceTired = "(-_-)";
    private String faceAsleep = "(-_-)zZZ";
    private String faceHappy = ":-)";
    private String faceAngry = "ఠ_ఠ";

    public Tamagotchi() {
        this.faceActual = this.faceNormal;
    }

    public String getFaceActual() {
        return faceActual;
    }
    public void setFaceActual(String face) {
        this.faceActual = face;
    }
    public String getFaceNormal() {
        return faceNormal;
    }
    public String getFaceTired() {
        return faceTired;
    }    
    public String getFaceAsleep() {
        return faceAsleep;
    }    
    public String getFaceHappy() {
        return faceHappy;
    }    
    public String getFaceAngry() {
        return faceAngry;
    }    
    public int getMood() {
        return mood;
    }
    public void setMood(int mood) {
        this.mood = mood;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void modifyFace() {
        if(this.energy == 0) {
            this.setFaceActual(this.faceAsleep);
        }
        if(this.energy < 3) {
            this.setFaceActual(this.faceTired);
        }
        if(this.mood < 2) {
            this.setFaceActual(this.faceAngry);
        }
        if(this.mood > 8) {
            this.setFaceActual(this.faceHappy);
        }
        if(this.mood <= 8 && this.mood >=2) {
            this.setFaceActual(this.faceNormal);
        }
    }

    public void goSleep() {
        this.setEnergy(getEnergy() + 2);
    }

    public void goPlay() {
        this.setEnergy(getEnergy() - 1);
        this.setHunger(getHunger() + 1);
        this.setMood(getMood() + 1);
    }

    public void goEat() {
        this.setHunger(getHunger() - 2);
        this.setEnergy(getEnergy() + 1);
    }

    public String lifeTamagotchi() {
        if(getEnergy() < 3) {
            goSleep();
        }
        if(getMood() < 2) {
            goPlay();
        }
        if(getHunger() > 4) {
            goEat();
        }
        modifyFace();
        return getFaceActual();
    }
}
