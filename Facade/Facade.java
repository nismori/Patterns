package Facade;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/")
public class Facade extends HttpServlet {
    private final Authentification authentification = new Authentification();
    private final Impression impression = new Impression();
    private final Paiement paiement = new Paiement();
    private final Stat stat = new Stat();

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getServletPath();
        String page, message;
        stat.enregistrer(url);
        switch (url) {
            case "/login/" -> {
                message = authentification.connecter(req.getParameter("login"), req.getParameter("password"));
                if (message.equals("Vous venez de passer admin")) {
                    stat.save("Une personne vient de passer admin");
                } else {
                    stat.save(req.getParameter("login") + " vient de se connecter");
                }
                req.setAttribute("nom", message);
                page = "authentification";
            }

            case "/paiement/" -> {
                req.setAttribute("paiement", paiement.payer());
                stat.save("Une transaction est en cours");
                page = "paiement";
            }

            case "/impression/" -> {
                req.setAttribute("impression", impression.imprimer());
                stat.save("Une impression est en cours");
                page = "impression";
            }

            default -> page = "accueil";
        }
        req.getRequestDispatcher("/WEB-INF/" + page + ".jsp").forward(req, resp);
    }
}

