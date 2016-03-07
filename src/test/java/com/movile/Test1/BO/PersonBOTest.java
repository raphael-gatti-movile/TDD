package com.movile.Test1.BO;

import com.movile.Test1.WS.CustomerWS;
import com.movile.Test1.WS.PersonWS;
import com.movile.Test1.bean.Person;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


/**
 * Created by raphael on 3/7/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonBOTest {

    @Mock
    PersonWS personWS;

    @InjectMocks
    PersonBO personBO;

    @Test
    public void testFindById() {

        Person marina = new Person(10, "Marina");

        //doReturn(marina).when(personWS).findById(3);
        when(personWS.findById(10)).thenReturn(marina);

        assertThat(personBO.findById(10)).hasFieldOrPropertyWithValue("name", "Marina");


    }



}