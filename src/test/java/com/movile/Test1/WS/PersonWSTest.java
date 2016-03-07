package com.movile.Test1.WS;

import com.movile.Test1.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.*;

/**
 * Created by raphael on 3/6/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonWSTest {


    @Test
    public void testFindById() throws Exception {

        PersonWS personWS = mock(PersonWS.class);

        Person marina = new Person(10, "Marina");

        when(personWS.findById(10)).thenReturn(marina);

        assertThat(personWS.findById(10)).hasFieldOrPropertyWithValue("name", "Marina");


    }

}