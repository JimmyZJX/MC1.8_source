/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import net.minecraft.src.bsu;
import net.minecraft.src.cjm;
import net.minecraft.src.MathUtils;
/*  8:   */ 
/*  9:   */ public class RealmsSliderButton
/* 10:   */   extends RealmsButton
/* 11:   */ {
/* 12: 8 */   public float value = 1.0F;
/* 13:   */   public boolean sliding;
/* 14:   */   private final float minValue;
/* 15:   */   private final float maxValue;
/* 16:   */   private int steps;
/* 17:   */   
/* 18:   */   public RealmsSliderButton(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 19:   */   {
/* 20:15 */     this(paramInt1, paramInt2, paramInt3, paramInt4, paramInt6, 0, 1.0F, paramInt5);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public RealmsSliderButton(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2)
/* 24:   */   {
/* 25:19 */     super(paramInt1, paramInt2, paramInt3, paramInt4, 20, "");
/* 26:20 */     this.minValue = paramFloat1;
/* 27:21 */     this.maxValue = paramFloat2;
/* 28:   */     
/* 29:23 */     this.value = toPct(paramInt6);
/* 30:24 */     getProxy().j = getMessage();
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getMessage()
/* 34:   */   {
/* 35:28 */     return "";
/* 36:   */   }
/* 37:   */   
/* 38:   */   public float toPct(float paramFloat)
/* 39:   */   {
/* 40:32 */     return MathUtils.clamp((clamp(paramFloat) - this.minValue) / (this.maxValue - this.minValue), 0.0F, 1.0F);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public float toValue(float paramFloat)
/* 44:   */   {
/* 45:36 */     return clamp(this.minValue + (this.maxValue - this.minValue) * MathUtils.clamp(paramFloat, 0.0F, 1.0F));
/* 46:   */   }
/* 47:   */   
/* 48:   */   public float clamp(float paramFloat)
/* 49:   */   {
/* 50:40 */     paramFloat = clampSteps(paramFloat);
/* 51:41 */     return MathUtils.clamp(paramFloat, this.minValue, this.maxValue);
/* 52:   */   }
/* 53:   */   
/* 54:   */   protected float clampSteps(float paramFloat)
/* 55:   */   {
/* 56:45 */     if (this.steps > 0) {
/* 57:46 */       paramFloat = this.steps * Math.round(paramFloat / this.steps);
/* 58:   */     }
/* 59:48 */     return paramFloat;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public int getYImage(boolean paramBoolean)
/* 63:   */   {
/* 64:53 */     return 0;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void renderBg(int paramInt1, int paramInt2)
/* 68:   */   {
/* 69:58 */     if (!getProxy().m) {
/* 70:59 */       return;
/* 71:   */     }
/* 72:62 */     if (this.sliding)
/* 73:   */     {
/* 74:63 */       this.value = ((paramInt1 - (getProxy().h + 4)) / (getProxy().b() - 8));
/* 75:64 */       this.value = MathUtils.clamp(this.value, 0.0F, 1.0F);
/* 76:65 */       float f = toValue(this.value);
/* 77:66 */       clicked(f);
/* 78:67 */       this.value = toPct(f);
/* 79:68 */       getProxy().j = getMessage();
/* 80:   */     }
/* 81:71 */     bsu.z().N().a(WIDGETS_LOCATION);
/* 82:72 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 83:73 */     blit(getProxy().h + (int)(this.value * (getProxy().b() - 8)), getProxy().i, 0, 66, 4, 20);
/* 84:74 */     blit(getProxy().h + (int)(this.value * (getProxy().b() - 8)) + 4, getProxy().i, 196, 66, 4, 20);
/* 85:   */   }
/* 86:   */   
/* 87:   */   public void clicked(int paramInt1, int paramInt2)
/* 88:   */   {
/* 89:79 */     this.value = ((paramInt1 - (getProxy().h + 4)) / (getProxy().b() - 8));
/* 90:80 */     this.value = MathUtils.clamp(this.value, 0.0F, 1.0F);
/* 91:81 */     clicked(toValue(this.value));
/* 92:82 */     getProxy().j = getMessage();
/* 93:83 */     this.sliding = true;
/* 94:   */   }
/* 95:   */   
/* 96:   */   public void clicked(float paramFloat) {}
/* 97:   */   
/* 98:   */   public void released(int paramInt1, int paramInt2)
/* 99:   */   {
/* :0:90 */     this.sliding = false;
/* :1:   */   }
/* :2:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsSliderButton
 * JD-Core Version:    0.7.0.1
 */