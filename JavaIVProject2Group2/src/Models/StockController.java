package Models;

import Repository.PlayerRepository;

public class StockController
{

	PlayerRepository stockrepo;
	

public StockController()
	{
	stockrepo = new PlayerRepository();
	}

public void createStockListing(StockModel stock)
	{
	//stockrepo.addStock(stock);
	}

public void updateDaily(StockModel stock)
	{
	stockrepo.updateStockPrice(stock);
	}
}