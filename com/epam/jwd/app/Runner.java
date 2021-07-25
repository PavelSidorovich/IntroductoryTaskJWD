package com.epam.jwd.app;

import com.epam.jwd.model.InvestmentAgreement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    private static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        LOGGER.trace("Starting the program!");
        if (args.length < 3) {
            LOGGER.error("Not enough arguments!");
            return;
        }

        InvestmentAgreement[] investmentAgreements = new InvestmentAgreement[] {
						new InvestmentAgreement(args[0], Double.valueOf(args[1]),
                                                Double.valueOf(args[2])),
						new InvestmentAgreement("Vladislav", 10, 2500),
						new InvestmentAgreement("Gleb", 7.25, 500),
						new InvestmentAgreement("Nikita", 10.5, 5000),
						new InvestmentAgreement("Viktoria", 25, 700),
        };

	LOGGER.debug("Reaching for operator! The length " +
                         "of invesmentAgreements is " + investmentAgreements.length);
	System.out.println();
        for (InvestmentAgreement investmentAgreement : investmentAgreements) {
            System.out.println(investmentAgreement);
            double interestRate = investmentAgreement.getInterestRate();
            if (interestRate < 0 || interestRate > 20) {
                LOGGER.warn("Not recommended value (interest rate is " + interestRate + ")!");
            }
	    System.out.println();
        }
        LOGGER.info("Program ends!");
    }
}
