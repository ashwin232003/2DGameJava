package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entity {
	
	public int worldX,worldY;
	public int speed;
	
	
	public BufferedImage up1,up2,down1,down2,right1,right2,left1,left2;
	public String direction;
	
	public int spriteCounter=0;
	public int spriteNum=1;
	public Rectangle solidArea;
	public int solidAreaDefaultX,solidAreaDefaultY;
	public boolean collisionOn=false;
	
	
	

}
