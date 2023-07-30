//package tan.le.shop1.repository;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.text.ParseException;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import tan.le.shop1.entities.dao.Address;
//import tan.le.shop1.entities.dao.LoginUser;
//import tan.le.shop1.entities.dao.Users;
//import tan.le.shop1.enums.AddressType;
//import tan.le.shop1.enums.GenderType;
//import tan.le.shop1.enums.LoginStatus;
//import tan.le.shop1.repository.AddressRepository;
//import tan.le.shop1.repository.LoginUserRepository;
//import tan.le.shop1.repository.UsersRepository;
//import tan.le.shop1.service.test;
//import tan.le.shop1.utils.DateFormatter;
//
//public class UsersRepositoryTest {
//
//	@Autowired
//	static LoginUserRepository loginUserRepository;
//	
//	@Autowired
//	static AddressRepository addressRepository;
//	
//	@Autowired
//	static UsersRepository usersRepository;
//	
//	@BeforeAll
//	  static void setUpBeforeClass() throws Exception {
//		
//	  }
//	
//
//	@Test
//	  void testSave() throws ParseException {
//		
////		test test1 = new test();
////		test1.testSave();
//		Users user = new Users(null, 
//									"asda",
//									"asd@asd.ASd",
//									"asdasd",
//									DateFormatter.dateFormatter("1986-04-08"),
//									GenderType.MALE,
//									null, 
//									null
//									);
//		LoginUser loginUser = new LoginUser(null, 
//				LoginStatus.in_progress, 
//				"asdasd", 
//				DateFormatter.datetimeFormatter("1986-04-08 12:30"), 
//				user);
//	  
//		Address address = new Address(null,
//										"line",
//										"street",
//										"ward",
//										"distric",
//										"city",
//										AddressType.home,
//										null,
//										user);
//		
//		LoginUser generatedId = loginUserRepository.save(loginUser);
//		Address generatedId2 = addressRepository.save(address);
//		
//		assertEquals(generatedId.getPassword(), loginUser.getPassword());
//		assertEquals(generatedId2.getDistrict(), address.getDistrict());
//		
//		loginUserRepository.delete(generatedId);
//		addressRepository.delete(generatedId2);
////		
//////		Long generatedId = staffDao.save(staff);
//////	    assertEquals(generatedId, staffDao.findById(generatedId).getId());
//////	    staffDao.delete(generatedId);
//	    }
//	
//}
