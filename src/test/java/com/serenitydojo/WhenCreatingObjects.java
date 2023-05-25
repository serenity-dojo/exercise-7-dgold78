package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5) {
            @Override
            public long getName() {
                return 0;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido", "Bone", 5) {
            @Override
            public long getName() {
                return 0;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };

        String dogSound = "";
        // TODO: implement a method in the Dog sound called makeNoise() that returns the sound a dog makes: "Woof", e.g.
        dogSound = fido.makeNoise();

        Assert.assertEquals(dogSound, "Woof");
    }

    @Test
    public void whenADogGetsFed() {
        Dog fido = new Dog("Fido", "Bone", 5) {
            @Override
            public long getName() {
                return 0;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };

        // TODO: implement a method in the Dog sound called feed() that sets the isFed variable to true:
         fido.feed();

        Assert.assertTrue(fido.isFed());

    }

    @Test
    public void whenAnimalsPlay() {
// TODO: Uncomment me

        Pet fido = new Dog("Fido", "Bone", 5) {
            @Override
            public long getName() {
                return 0;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };
        Pet spot = new Cat("Spot", "String", 5) {
            @Override
            public long getName() {
                return 0;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };
        Pet hazel = new Hamster("Hazel", 1, "Wheel") {
            @Override
            public long getName() {
                return 0;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };

        assertThat(fido.play(), equalTo("plays with bone"));
        assertThat(spot.play(), equalTo("plays with string"));
        assertThat(hazel.play(), equalTo("runs in wheel"));
    }
}
