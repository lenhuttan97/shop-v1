//package tan.le.shop1.service;
//
//import java.text.ParseException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import tan.le.shop1.entities.dao.Address;
//import tan.le.shop1.entities.dao.LoginUser;
//import tan.le.shop1.entities.dao.Users;
//import tan.le.shop1.enums.GenderType;
//import tan.le.shop1.enums.LoginStatus;
//import tan.le.shop1.repository.AddressRepository;
//import tan.le.shop1.repository.LoginUserRepository;
//import tan.le.shop1.repository.UsersRepository;
//import tan.le.shop1.utils.DateFormatter;
//
//@Service
//public class test {
//	@Autowired
//	LoginUserRepository loginUserRepository;
//	
//	@Autowired
//	AddressRepository addressRepository;
//	
//	@Autowired
//	UsersRepository usersRepository;
//	
//	public void testSave() throws ParseException {
//			Users user = new Users(null, 
//										"asda",
//										"asd@asd.ASd",
//										"asdasd",
//										DateFormatter.dateFormatter("1986-04-08"),
//										GenderType.MALE,
//										null, 
//										null
//										);
//			LoginUser loginUser = new LoginUser(null, 
//					LoginStatus.in_progress, 
//					"asdasd", 
//					DateFormatter.datetimeFormatter("1986-04-08 12:30"), 
//					user);
//		  
//			Address address = new Address(null,
//											"line",
//											"street",
//											"ward",
//											"distric",
//											"city",
//											"home",
//											null,
//											user);
//			
//			LoginUser generatedId = loginUserRepository.save(loginUser);
////			Address generatedId2 = addressRepository.save(address);
//			
////			assertEquals(generatedId.getPassword(), loginUser.getPassword());
////			assertEquals(generatedId2.getDistrict(), address.getDistrict());
//			
////			loginUserRepository.delete(generatedId);
////			addressRepository.delete(generatedId2);
//			
////			Long generatedId = staffDao.save(staff);
////		    assertEquals(generatedId, staffDao.findById(generatedId).getId());
////		    staffDao.delete(generatedId);
//		    }
//		
//}
