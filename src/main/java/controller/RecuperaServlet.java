package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hotel;
@WebServlet("/recupera.do")
public class RecuperaServlet extends HttpServlet {
		
	
	public void doGet(HttpServletRequest request, HttpServletResponse response )
	throws IOException,ServletException
	{
		ArrayList<Hotel> bd= new ArrayList<Hotel>();
		
		bd.add(new Hotel(1,"Confort Ibirapuera","O Comfort Ibirapuera possui 79 confortáveis e aconchegantes apartamentos. Oferecemos também facilidades como fitness center, piscina com solarium e deslumbrante vista de São Paulo, room-service até às 23 horas, restaurante, recepção 24 horas e sala para eventos até 35 pessoas.","⭐⭐⭐⭐⭐ "));
		bd.add(new Hotel(2,"Sheraton São Paulo WTC Hotel","O Sheraton São Paulo WTC Hotel oferece acomodações em São Paulo. O hotel conta com piscina ao ar livre e academia de ginástica, e os hóspedes podem degustar uma bebida no bar. Há estacionamento privativo disponível no local. Todos os quartos incluem uma televisão de tela plana. Todos os quartos estão equipados com banheiro privativo. Para seu conforto, você encontra produtos de banho gratuitos e secador de cabelo. O prédio dispõe de recepção 24 horas, cabeleireiro e loja de presentes.","⭐⭐⭐⭐⭐ "));
		bd.add(new Hotel(3,"Blue Tree Premium Morumbi","Quartos sofisticados com mobília moderna, Wi-Fi gratuito e TV. As acomodações de categoria mais alta incluem sacada. As suítes oferecem área de estar. Já as acomodações de categoria mais alta dispõem de sala de estar separada. Serviço de quarto disponível. Crianças de até cinco anos (uma por quarto) acompanhadas de um responsável não pagam.","⭐⭐⭐⭐ "));
		
		
		//buscando o id da requisicao do cliente
		
		int id  =Integer.parseInt((request.getParameter("id")));
		
		//logica veriricar se encontrou ou nao o usuario no array
		
		
		Hotel result = null;
		
		for(Hotel user: bd) {
			if(user.getId() == id) {
				result = user;
				break;
			}
				
			
		}
		//preparando retorno pro lciente
		
		
		String paginaDestino = "";
		if(result!= null) {
			//variavel usada dps
			request.setAttribute("Hotel", result);
			paginaDestino="/info.jsp";
		}else {
			paginaDestino="/erro.jsp";
		}
		
		//retornar a chamada http pro cliente
		
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaDestino);
	
		dispatcher.forward(request, response);
	}
	
}
