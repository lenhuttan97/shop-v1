package tan.le.shop1.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tan.le.shop1.entities.dao.Address;
import tan.le.shop1.entities.dao.LoginUser;
import tan.le.shop1.entities.dao.Users;
import tan.le.shop1.entities.dto.AddressDto;
import tan.le.shop1.entities.dto.AdminDto;
import tan.le.shop1.entities.dto.Login;
import tan.le.shop1.entities.dto.user.UserDetailDto;
import tan.le.shop1.enums.AddressType;
import tan.le.shop1.enums.GenderType;
import tan.le.shop1.enums.LoginStatus;
import tan.le.shop1.mapper.IAddressMapper;
import tan.le.shop1.repository.AddressRepository;
import tan.le.shop1.repository.LoginUserRepository;
import tan.le.shop1.repository.UsersRepository;
import tan.le.shop1.service.AdminService;
import tan.le.shop1.utils.DateFormatter;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private IAddressMapper mapper;
	
	@GetMapping("/find-all")
    public AdminDto listAll(Model model) throws ParseException {
//		Users user = new Users(null, 
//				"asda",
//				"asd@asd.ASd",
//				"asdasd",
//				DateFormatter.dateFormatter("1986-04-08"),
//				GenderType.MALE,
//				null, 
//				null,
//				null, null
//				);
//LoginUser loginUser = new LoginUser(null, 
//LoginStatus.in_progress, 
//"asdasd", 
//DateFormatter.datetimeFormatter("1986-04-08 12:30"), 
//user);
//
////user.setLoginUser(loginUser);
//LoginUser generatedId = loginUserRepository.save(loginUser);
//        List<Users> listUsers = usersRepository.findAll();
////        loginUserRepository.delete(generatedId);
////        usersRepository.delete(listUsers.get(0));
		
		AdminDto adminDto = AdminDto.builder()
									.fullname("asd")
									.amdinType("asd")
									.password("asd")
									.username("asdasdd")
									.permit("asd")
									.status(LoginStatus.logout)
									.build();
//		AddressDto address = AddressDto.builder()
//										.line("asd")
//										.build();
//		
//		Address address = Address.builder().city("asdasd").build();
//		AddressDto dto = mapper.toDto(address);
//		System.out.println(dto.toString());
//		System.out.println(mapper.toEntity(dto).toString());
		
//        return mapper.toDto(address);
		
		return adminService.save(adminDto);
    }
//	
//	@GetMapping("/find")
//    public List<Users> listAll1(Model model) throws ParseException {
//		List<Users> listUsers = usersRepository.findAll();
//
//		Address address = new Address(null,
//				"line",
//				"street",
//				"ward",
//				"distric",
//				"city",
//				AddressType.home,
//				null,
//				listUsers.get(0));
//		Address generatedId2 = addressRepository.save(address);
//        List<Users> listUsers2 = usersRepository.findAll();
//        return listUsers2;
//    }
//	
	
	@PostMapping("/")
	 public AddressDto list(@RequestBody AddressDto addressDto ) throws ParseException {
		
		return null;
	}
}
