package com.enigma.wmbahari.servlet;

import com.enigma.wmbahari.dao.FoodDao;
import com.enigma.wmbahari.model.Food;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Food")
public class FoodServlet extends HttpServlet {
    private FoodDao foodDao;

    @Override
    public void init() throws ServletException {
        foodDao = new FoodDao();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Food> foods = foodDao.getAllFood();
        req.setAttribute("foods", foods);
        req.getRequestDispatcher("food/food.jsp").forward(req, resp);
    }
}