package com.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TamagotchiTest {
    
    Tamagotchi myLittleTama;

    @Test
    public void new_tamagotchi_have_4_mood()
    {
        myLittleTama = new Tamagotchi();
        assertEquals(4, myLittleTama.getMood());
    }

    @Test
    public void new_tamagotchi_have_4_hunger()
    {
        myLittleTama = new Tamagotchi();
        assertEquals(4, myLittleTama.getHunger());
    }

    @Test
    public void new_tamagotchi_have_4_energy()
    {
        myLittleTama = new Tamagotchi();
        assertEquals(4, myLittleTama.getEnergy());
    }

    @Test
    public void new_tamagotchi_have_faceActual()
    {
        myLittleTama = new Tamagotchi();
        assertEquals(":-|", myLittleTama.getFaceActual());
    }



    @Test
    public void if_tamagotchi_have_less_3_energy_then_faceTired()
    {
        myLittleTama = new Tamagotchi();
        myLittleTama.setEnergy(2);
        myLittleTama.modifyFace();
        assertEquals(2, myLittleTama.getEnergy());
        assertEquals("(-_-)", myLittleTama.getFaceActual());
    }

}
