package com.movile.Test1.WS;

import com.movile.Test1.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by raphael on 3/6/16.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(PersonWS.class)
public class PersonPowerMockitoWSTest {


    @Test
    public void testFindById() throws Exception {

        PowerMockito.mockStatic(PersonWS.class);

        Person marina = new Person(10, "Marina");

        when(PersonWS.staticFindById(10)).thenReturn(marina);

        assertThat(PersonWS.staticFindById(10)).hasFieldOrPropertyWithValue("name", "Marina");


    }
}