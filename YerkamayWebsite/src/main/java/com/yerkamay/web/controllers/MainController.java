package com.yerkamay.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping({"/", "index"})
	public String getIndex(ModelAndView modelAndView) {
		return "index";
	}
	
	@RequestMapping("/centro")
	public String getCentro(ModelAndView modelAndView) {
		return "centro";
	}
	
	@RequestMapping("/directora")
	public String getDirectora(ModelAndView modelAndView) {
		return "directora";
	}
	
	@RequestMapping("/tpsicologicas")
	public String getTerapiasPsicologicas(ModelAndView modelAndView) {
		return "tpsicologicas";
	}
	
	@RequestMapping("/tinfantil")
	public String getTerapiaInfantil(ModelAndView modelAndView) {
		return "tinfantil";
	}
	
	@RequestMapping("/tadolescentes")
	public String getTerapiaAdolescentes(ModelAndView modelAndView) {
		return "tadolescentes";
	}
	
	@RequestMapping("/tespiritual")
	public String getTerapiaEspiritual(ModelAndView modelAndView) {
		return "tespiritual";
	}
	
	@RequestMapping("/tgapoyo")
	public String getTerapiaGruposApoyo(ModelAndView modelAndView) {
		return "tgapoyo";
	}
	
	@RequestMapping("/taromaterapia")
	public String getTerapiaAromaterapiaRelajacion(ModelAndView modelAndView) {
		return "taromaterapia";
	}
	
	@RequestMapping("/tpsicosomaticas")
	public String getTerapiasPsicosomaticas(ModelAndView modelAndView) {
		return "tpsicosomaticas";
	}

	@RequestMapping("/talleres")
	public String getTalleres(ModelAndView modelAndView) {
		return "talleres";
	}
	
	@RequestMapping("/capacitaciones")
	public String getCapacitaciones(ModelAndView modelAndView) {
		return "capacitaciones";
	}
	
	@RequestMapping("/coaching")
	public String getCoaching(ModelAndView modelAndView) {
		return "coaching";
	}
	
	@RequestMapping("/csocial")
	public String getCompromisoSocial(ModelAndView modelAndView) {
		return "csocial";
	}
	
	@RequestMapping("/csaludintegral")
	public String getSaludIntegral(ModelAndView modelAndView) {
		return "saludintegral";
	}
	
	@RequestMapping("/donaciones")
	public String getDonaciones(ModelAndView modelAndView) {
		return "donaciones";
	}
	
	@RequestMapping("/testimonios")
	public String getTestimonios(ModelAndView modelAndView) {
		return "testimonios";
	}
	
	@RequestMapping("/contacto")
	public String getContacto(ModelAndView modelAndView) {
		return "contacto";
	}
	
	@RequestMapping("/becas")
	public String getBecas(ModelAndView modelAndView) {
		return "becas";
	}
	
}
