package com.cropdeal.DealerService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cropdeal.DealerService.model.Dealer;
import com.cropdeal.DealerService.repository.DealerRepository;
import com.cropdeal.DealerService.resource.DealerController;

@RunWith(SpringRunner.class)
@SpringBootTest
class DealerServiceApplicationTests {
    
	@Autowired
	private DealerController  service;
	
	@MockBean
	private DealerRepository repository;
	
	@Test
	public void getdealerTest()
	{
		when(repository.findAll()).thenReturn(Stream.of(new Dealer("122","Jhon","shiva@gmail","6789055","erfdff", null),new Dealer("122","Jhon","shiva@gmail","6789055","erfdff", null)).collect(Collectors.toList()));
		assertEquals(2,service.getdealer().size());
	} 
	
	@Test
	public void adddealerTest()
	{
		Dealer dealer= new Dealer("6","Jhon","shiva@gmail","6789055","erfdff", null);
		//Dealer saveddealer= new Dealer("6","Jhon","shiva@gmail","6789055","erfdff", null);
		when(repository.save(dealer)).thenReturn(dealer);
		assertEquals(dealer,service.adddealer(dealer));
		
	}
	
	@Test
	public void deleteDealerTest()
	{
		String id="7";
		repository.deleteById(id);
		verify(repository, times(1)).deleteById(id);
		
	}
}
