package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ import org.apache.logging.log4j.LogManager;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ 
/*   7:    */ public class GoalSelector
/*   8:    */ {
/*   9: 12 */   private static final Logger LOGGER = LogManager.getLogger();
/*  10: 25 */   private List<Goal> b = Lists.newArrayList();
/*  11: 26 */   private List<Goal> activeSet = Lists.newArrayList();
/*  12:    */   private final Profiler profiler;
/*  13:    */   private int e;
/*  14: 29 */   private int f = 3;
/*  15:    */   
/*  16:    */   public GoalSelector(Profiler profiler)
/*  17:    */   {
/*  18: 32 */     this.profiler = profiler;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void addGoal(int paramInt, GoalType paramzb)
/*  22:    */   {
/*  23: 36 */     this.b.add(new Goal(this, paramInt, paramzb));
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void removeGoal(GoalType paramzb)
/*  27:    */   {
/*  28: 40 */     Iterator<Goal> it = this.b.iterator();
/*  29: 41 */     while (it.hasNext())
/*  30:    */     {
/*  31: 42 */       Goal localzd = it.next();
/*  32: 43 */       GoalType localzb = localzd.type;
/*  33: 45 */       if (localzb == paramzb)
/*  34:    */       {
/*  35: 46 */         if (this.activeSet.contains(localzd))
/*  36:    */         {
/*  37: 47 */           localzb.stop();
/*  38: 48 */           this.activeSet.remove(localzd);
/*  39:    */         }
/*  40: 51 */         it.remove();
/*  41:    */       }
/*  42:    */     }
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void tick()
/*  46:    */   {
/*  47: 57 */     this.profiler.a("goalSetup");
/*  48:    */     Goal goal;
/*  49: 59 */     if (this.e++ % this.f == 0)
/*  50:    */     {
/*  51: 60 */       for (Iterator<Goal> it = this.b.iterator(); it.hasNext();)
/*  52:    */       {
/*  53: 60 */         goal = it.next();
/*  54: 61 */         boolean active = this.activeSet.contains(goal);
/*  55: 63 */         if (active)
/*  56:    */         {
/*  57: 64 */           if ((!isUninhibited(goal)) || (!canContinue(goal)))
/*  58:    */           {
/*  59: 65 */             goal.type.stop();
/*  60: 66 */             this.activeSet.remove(goal);
/*  61:    */           }
/*  62:    */         }
/*  63: 72 */         else if ((isUninhibited(goal)) && (goal.type.canStart()))
/*  64:    */         {
/*  65: 76 */           goal.type.start();
/*  66: 77 */           this.activeSet.add(goal);
/*  67:    */         }
/*  68:    */       }
/*  69:    */     }
/*  70:    */     else
/*  71:    */     {
/*  72: 80 */       Iterator<Goal> it = this.activeSet.iterator();
/*  73: 82 */       while (it.hasNext())
/*  74:    */       {
/*  75: 83 */         goal = it.next();
/*  76: 84 */         if (!canContinue(goal))
/*  77:    */         {
/*  78: 85 */           goal.type.stop();
/*  79: 86 */           it.remove();
/*  80:    */         }
/*  81:    */       }
/*  82:    */     }
/*  83: 90 */     this.profiler.b();
/*  84:    */     
/*  85: 92 */     this.profiler.a("goalTick");
/*  86: 98 */     for (Iterator<Goal> localIterator = this.activeSet.iterator(); localIterator.hasNext();)
/*  87:    */     {
/*  88: 98 */       goal = localIterator.next();
/*  89:    */       
/*  90:    */ 
/*  91:    */ 
/*  92:102 */       goal.type.tick();
/*  93:    */     }
/*  94:104 */     this.profiler.b();
/*  95:    */   }
/*  96:    */   
/*  97:    */   private boolean canContinue(Goal goal)
/*  98:    */   {
/*  99:108 */     boolean bool = goal.type.canContinue();
/* 100:109 */     return bool;
/* 101:    */   }
/* 102:    */   
/* 103:    */   private boolean isUninhibited(Goal goal)
/* 104:    */   {
/* 105:117 */     for (Goal goal1 : this.b) {
/* 106:118 */       if (goal1 != goal) {
/* 107:122 */         if (goal.inversePriority >= goal1.inversePriority)
/* 108:    */         {
/* 109:123 */           if ((!canCoexist(goal, goal1)) && (this.activeSet.contains(goal1))) {
/* 110:124 */             return false;
/* 111:    */           }
/* 112:    */         }
/* 113:126 */         else if ((!goal1.type.inhibitsOtherGoal()) && (this.activeSet.contains(goal1))) {
/* 114:127 */           return false;
/* 115:    */         }
/* 116:    */       }
/* 117:    */     }
/* 118:130 */     return true;
/* 119:    */   }
/* 120:    */   
/* 121:    */   private boolean canCoexist(Goal goal1, Goal goal2)
/* 122:    */   {
/* 123:134 */     return (goal1.type.j() & goal2.type.j()) == 0;
/* 124:    */   }
/* 125:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zc
 * JD-Core Version:    0.7.0.1
 */