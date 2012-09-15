package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;
import static org.junit.matchers.StringContains.containsString;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        //assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutSpa() throws Exception {
        String test = queryProcessor.process("ewqeqw:whichis:2012,234,56666");
       // assertTrue(test.equals("56666"));
       // assertThat(queryProcessor.process("SPA2012test"), containsString("conference"));
    }
}
