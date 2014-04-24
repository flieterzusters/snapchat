package worms.model;

import java.util.Collection;
import java.util.Random;

class Facade implements IFacade {

	public void addEmptyTeam(World world, String newName) {
		// TODO Auto-generated method stub
		
	}

	public void addNewFood(World world) {
		// TODO Auto-generated method stub
		
	}

	public void addNewWorm(World world) {
		// TODO Auto-generated method stub
		
	}

	public boolean canFall(Worm worm) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canMove(Worm worm) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean canTurn(Worm worm, double angle) {
		// TODO Auto-generated method stub
		return false;
	}

	public Food createFood(World world, double x, double y) {
		// TODO Auto-generated method stub
		return null;
	}

	public World createWorld(double width, double height,
			boolean[][] passableMap, Random random) {
		// TODO Auto-generated method stub
		return null;
	}

	public Worm createWorm(World world, double x, double y, double direction,
			double radius, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void fall(Worm worm) {
		// TODO Auto-generated method stub
		
	}

	public int getActionPoints(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Projectile getActiveProjectile(World world) {
		// TODO Auto-generated method stub
		return null;
	}

	public Worm getCurrentWorm(World world) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection getFood(World world) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getHitPoints(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double[] getJumpStep(Projectile projectile, double t) {
		// TODO Auto-generated method stub
		return null;
	}

	public double[] getJumpStep(Worm worm, double t) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getJumpTime(Projectile projectile, double timeStep) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getJumpTime(Worm worm, double timeStep) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getMass(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxActionPoints(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMaxHitPoints(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getMinimalRadius(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName(Worm worm) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getOrientation(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getRadius(Food food) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getRadius(Projectile projectile) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getRadius(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getSelectedWeapon(Worm worm) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTeamName(Worm worm) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWinner(World world) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection getWorms(World world) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getX(Food food) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getX(Projectile projectile) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getX(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getY(Food food) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getY(Projectile projectile) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getY(Worm worm) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isActive(Food food) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isActive(Projectile projectile) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAdjacent(World world, double x, double y, double radius) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAlive(Worm worm) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isGameFinished(World world) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isImpassable(World world, double x, double y, double radius) {
		// TODO Auto-generated method stub
		return false;
	}

	public void jump(Projectile projectile, double timeStep) {
		// TODO Auto-generated method stub
		
	}

	public void jump(Worm worm, double timeStep) {
		// TODO Auto-generated method stub
		
	}

	public void move(Worm worm) {
		// TODO Auto-generated method stub
		
	}

	public void rename(Worm worm, String newName) {
		// TODO Auto-generated method stub
		
	}

	public void selectNextWeapon(Worm worm) {
		// TODO Auto-generated method stub
		
	}

	public void setRadius(Worm worm, double newRadius) {
		// TODO Auto-generated method stub
		
	}

	public void shoot(Worm worm, int yield) {
		// TODO Auto-generated method stub
		
	}

	public void startGame(World world) {
		// TODO Auto-generated method stub
		
	}

	public void startNextTurn(World world) {
		// TODO Auto-generated method stub
		
	}

	public void turn(Worm worm, double angle) {
		// TODO Auto-generated method stub
		
	}  }
