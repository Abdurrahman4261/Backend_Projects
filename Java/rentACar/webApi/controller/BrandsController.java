package kodlama.io.rentACar.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

@RestController  			// annotation   (controller olduğunu anlıyorr)
@RequestMapping("api/brands")  	// ulaşım için yöntemi
public class BrandsController {
	private BrandService brandService;
	@Autowired  // parametreye bak kim implemente ediyorsa onun new halini bana ver
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	@GetMapping("/getAll")
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
		
	}
	
	@PostMapping("/add")
	public void add (CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	/*
	 * @GetMapping("/getItem") public List<Brand> getItem(int id){ return
	 * braindService.getAll();
	 * 
	 * }
	 */
}






