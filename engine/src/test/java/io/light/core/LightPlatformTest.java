package io.light.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <p> </p>
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class LightPlatformTest {

    private LightPlatform LIGHT_PLATFORM = new LightPlatform();

    @Test
    public void name() {
        assertNotNull(LIGHT_PLATFORM);
    }
}