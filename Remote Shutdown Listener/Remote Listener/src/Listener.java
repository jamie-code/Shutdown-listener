import java.net.*;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.io.*;
import java.security.SecureRandom;

public class Listener extends Thread {
   private ServerSocket serverSocket;
   
   public Listener(int port) throws IOException {
      serverSocket = new ServerSocket(port);
      //serverSocket.setSoTimeout(10000);
   }
   String authKey="WNG6Chr6r2Q8N0R*mZv$PyYoEoM26fTuKkda20Hr2*6JhG0mw$7Aj1RXA4udITKF1FtQ4z1fMHiwzl8906iFdsp$uIxibs5Uf&gjnIVom8N^0dO&W50db$fz0D*C93cbUWg@XsNkmk7l3klj#h9jog4owCE*xzuj*tON&bTgrUCn&fRDjWvXIEnyGw8gNh2P!c18Pz3PDcP22%OqdEi0MFm%qvwGduI**%l7Xsd5E@Pd2r4MmHjbPYj#HsSUeYQKY&$iVjBba#IL@*6lwFaGnfAAGabghm*8BiVeu9Z2AZB#ZmO9syG2CR038cGBx#NlCmLYOg0vvI7fYC0RIjEsPE*zh8W5#si$algWfOObz!UYcW9EEnz!zn&#4Ti1@UkfdN*ljeZj7S5zgiHR4Uz^8ITQD67n@pXZY3&koT5114pt@uIHF5R3UD0yqd&B1x3PWFu@7JX0f%19ek$s9yX!gmDItkwlRVLgoE&YcogC@LLc&Ty!M^wu^unMZLg5PjiC51oqyi2*Io#Gr0RfK0SCU@MUjJ%FvhYkzOg*zS9t#&%0^of13&3ryu0r#psU%V1jryuj29Bj!V3GvZ*2iQ34Bo6gtYZC!DdE6YMbBto*$4KFXDWOsbCKR2owU63YKUkW!ZAYImRlZeF4!aE8&VSwwr%**Qhm4!uq1KtFF@!d!Oka91ARdGNj919g!b00bGDu%^pEGdanzyr^LuoGfjd*P$xO3YVMjJK!Y9FPf6BrjDySu!rpEQnLmWW#k!Hj0HVGZ3oZ6EC4RkPS&jaRKVZl9pbfK$fg3ApOq5wi92px%RUmz!Y*$xeKOOibe!1fgRo*FI#%IircHTFu#L*xE!iASjzRwUdrD%Y0hB4ipX0Lx4c^zcJYHLzZ4DOs^*u&NBT6mBW&JSHvF8&Bet8@iB2WQFDNs4T#N$a3jTKL#B8NP%lp8wObr#BTFO86GJsn#1MD!*B978Hc2E^DT3v*RJy7*qBO0hSEj^MDVRuj^9OD#DRJwT3OMr!qoS^gKTFJa#LRX#wl7UDUOMQVSe6fsCFsZL^nrvs&&&9dc8HdATOvNncI#H*C0CvCjkMx2WnZA6H27z$j#9fXUQ0N8jx2M53f2ZzC^RKTyYP0fSBXp%%IOC$SbGZTuZKxP%2Jh^ZaoZ6Ytwi6$UP%tCa2Zt17nYmpULuxCxa%ZCEc!7WDkW8Wb^pJOYvnU7DrL&CT@fjoW#m2BGjFD81ETm%1I0^J^3427JzL!8gb0h7DrEKr4nM61*uT7A7b@4tJ!it@N7H2gFD^m8OBS#0v@QXZaF3b1kZirctrdjqM#^Z50aF0Y%v1E5pTX$mGsMcHUKU@0Qx!Q&53naC4OUdhXI7eLO088ub2%cHm1JILIUZ#sYji5SdkvUlv0qoaZ!pD&NsDBprjK6@RiALrQ77hm$M8Xv^mVEyyY*%f#GLjnst1AsBb&q&4SlPx1cP@d^tlYu94&1k0CpNXSiZuFiRhBhDCQ6DIEpWS*m*q6dEvH7SJvbAz9MiBSbiq28EvFjZ2Wgm*HgJKc^4^lcXxypVVGz%ieM3^w8gi6!oAnzBElQS!SC7rku5WKlLobV#@y@NXDal$S9pInAxuK9rpLUv!i4IH4N#3qj&LzW&P#4Yz$6Nt2YwWNN7rygMmwd$6UibgfTug^%NGt%x8rePXSTyps1PrYxmWIL!LbolT%M*rkn2L0ei^3knNX#&UVMLIma#wluPOJFWjL$yL30Fd79BArzO5OVVC42BNQvtw7W!tu5hSijoa4KbfD0BVvufpp4HfaMFzqBsSjiC!FwTFKdsMbkrb%mqGAJB3Awzi$9eUUv@eme%mE744C2xnchmH!92YQg3G2Np3%Yx8AA9#j@$JjTe4o8SJt#4WA@n^8u5QsX9mkPi5@WY4iVYLwHyPYk&7i!%gEjtuWQQ5Cg424v4HNx55ZBjhC0jqCTdqH*6YWVC2C3#yXS#E$oXF*b9Bv8V10LkUl9bZI5m@nLkh0Sa&KrZ#IagGmga4y6%AbUCLx6^TPdT3a&y#RYuKG0#f9YAG6WqhUH4tOMfZPrszalU0SILjfccbgD4XWMBMHSfKk6dKa&l0Q9am$CADwVkgH6J4bhy6E^4luEyJ9vNNPKBdkLp80ExMO8aW2Gi6eSP#vB%jz7pjhr9Mol%s8yb^m8#LtwAd6iy13v1$%ATUgB%9V6Cd6tonwbQrI#zN$3sQagxcS8VreUaSaACtJ$VcbBRrHQCG#Rcz*2Ondrz#$*SgHOUGdfcsuPRMh2d!FvEl3@Erp^ZkbkU8J4K&y$!aNLP%AC0n7FJh54#AkpdKD0^r$$sYOL2zJ2nJfzimp3iYNB$r^plp%7mk8aYhI4uXuX6Tr^ekmUqqG^xLiNEafG4&GwrY2d#aK@jeLeyOS@Ua%RL!kBv0O0%$3608H9f6wXOSMeVtNTc1BzeDaWxgJnf8WQ36ehfz@*i84^*d5ve%2J7azyxdoT2qQr8Y6pv!wv%1$OvIV@eOAvnvw%H1%$JWTZO@KnBwQbBEBsNUAg73tvjyn8z$sYX6QvhL4Ep&AQXM3p9nijgVrP40GgzZy&*yBuQ4m7&cVQlJCx0X3Z1%*ye04kC%3HZlBUbkzbo5osIus$OpyeZXC@g50*r2Ra53^DrrE80ZHfFnhSztEL@Qcdr1aJ9WgHhV#ZeNVU@8Scc5q2LDjt5o9#m5%WSP^^6BglXHHr!6lJDzt$NDFqfof0dex6Glt5IVl!QDfrsxgmWh7QLVbauwWBc1I#7le7PS#ZIQ6n5lsLPztFP8xTpRoPb8XbqLoV4eekC9HTSfKkzwT05##oNnbODLzTcIEVFyhN^EIDmA6jy%#lPM*3yXq4duo7YL!81f!uJ6*kPbU2TfjW1%8hEZu5ds*EfLhDpTdL5$jIUAc%t1k2&A!GQrUzT7LFwcOz%F!dFJdJW@E!@!Ovj44H32TNf%zuXsR!W$c4VGHvefAZz6Frx7xf*OhTHNdLmXmdCCJuB35xEECcYZ^DZshR3V5Lv8%h!5%zwYPaVs$pNPyUus7rkf4FLwOLFi!Y@Z#5@WbvRc*rH1AED0JV76xD098F90vf@FD#F0C79z6taDpE@SvGOqxmzxEq84YQ8@EpsHlW0ew&Hx!aBL*LRoPX39r9iS7HQ!KqdP31qo1uBX*Ta#wjD8fNPoM75nSPWmCp0G27Uug@M@JHI2j7u0HJRP^aB9jV9xEBQ^ViOlQ1oWtcItVjL!d$8hhx%VzbD$bJJLU0M7r3NS%LqUkO%CugHH%tK%W3x4Jlug#XKzbiCZl1!&z9XD^B9TrCJx$70a&&CyLeFxqRn05&JUApfxTYNRchnVcvI$*fVI2$QcNBtzBsFIE&5D7kYAeX2c9lNitiJgCgC0Uf42EiTTK&NekGEB^FO!bNPy%0PD@Vcw3Po7lk%QEGm!Df!!E31%c#bZ&Q&VMGv^!QrnJ*uohgQDuVqdHeEQ*W&o4RkFtYsjFRm20fDYodIC#ls$HKLpCNgRut3pftHfYHZa!iP50OI0eZx&4HHHY6UhDsegIdi5B4hu9!V2tk7ekChqxxS1F*UB1bJQeEoht4AW@YBiEJ%Yy5HPoczE422MtiFJ&uHlgUtlEZVmd5A$yK5EsFYdlSMWhlZOzWfUiTwE3tZFTXa4jm86!FxK*MI4C&2N@jV2ZclAnE$*p*W9J8FN$raCx%Ettz$E8EAYZmyoQ&Gr#5Noky6!CcoA@rZh4HUbDA0Dxq2BGdM%x!vqPDZmh!D3!OJFcHrSTFt9evhC@Lk1F#fLZQQWIzOJz5ytWzOwci764fb4I*$B2ajZ3F4kupRySBwyNLRja&CP*OvTwZpCJ1B#nAIF7mFpv%Ai*cspdru@xCsEF9UbySId2LS08X7DZrk2ogYQ4e%Wl!W&sO0OKiWQKrOZf5Y$0jUWWKcq8*rNPJVgQNsojv^5j0NklZqsGdC7g%#3!GPKAsKh!6Uo^uJ0nCxH75KAH@ieEqcp!KDKnoX#2rN6wt4@X8gc9xYGWo9WLLHZ%ZpgaElrAkkHzTPD@TVMZXlS4$H&05FXg39OKUPaQ@xHXQOPyQsMqCbn0b#kQkqRyK3qqMR2N83K0ON!zFUZaSTjhnGO7LSzrX0&y9lk2vEvL1*SdHrBt!v^TdpyPXtO*YoPX08iJN0I#SYASEgQTeZavLTq#uMZQI5RAMEKTzrGMtcacZZsKWcFWs##Rcl2nwIJP^WWbfN#mX5@A07VyOxRVNide6&pcZSCSHRUeoMBeKKvdkcRnr44*NRja9WeVpTOYgnHpM0%eiMFtvLGGtMrGMFhu!y2ROoKbKX7#MCpjSWMU2eIa0cB7Mxh^n4GD&e1xE2JxUoGsF3M!gRHqiAMRxI!V^ZEag9EdXPhhWmrP$Cn^ieX4gxqKPW12hqqrd8v1I8Xu67P#adERwkLW3vOKjmT5EV#PIEUGbbrfbgO9nHE5I8$obJT95vrHvIOJs8Ol!LUzv3IWNhdDz!JHaIdV16!AP6kT0e@nu6VSd*p78oSl#VUQhTebV$AnFP7BHsJKm&F4152@cR%3KOQlQ7ut3!EhxxH5gEAqdPClLDxYheUpVy^TIeFuiFSviF8E02f$TaQ4baE3z4O&VtpTAxu96kU32QW$b80myPCbPGgroKISQZSWQun8z73EhlTfQzPwrYCVWuotJTVXAP%o1rGsmw0OOGXX*9YCxQmvN*cWmyJoGXX$Xwy2xr31lPs0s@%nxoIjDnicdyjSuL%!R6njdDrLAfEAd2Y3wYll*M0sTEFJ4WTpIc1CP2*B5q5lmWPqQTZJQToFLHm2t7TBdzv%L#eQLGFFFkncUzM^wg#MaanLAaME78z!U9njfrLf1r4iTw*s*6&i2ZV4At&qqDKs^tzQX%Cz*UTNDNGGrDgmOG*It0cOqidFM22gQZclRsyYl21JJ7tKzk%$LAUd^fImytasgd*K$dDKF3dF7kNZa4ThcUG!duC#rb^dZx#R!U1aXSYoRuskKmQFqf1Sn093915Pi$8gJdRnLMLkGJ3PotCtpR00yG71&6lSIp7SRxeo!4fRQZOkM1d2NjEMJ^RaMkl6hZuKFU2riyWdxXrrWb*LjZ*Giq0Fg@PmgfC*FIsfCbJ!4I3Ism$*w#mtSyt84Kt^5Iihw!m$yY0OKdPIs0N2TYPZ#&YO5hH*X0Ao*25RKPrNfOyE3Zen3l#E^v9W5N0gM1jHwPAcJb2e6A!@YM09b2kWXXQRcRlda7OdDWxk8HY8z6$d0TNSSsYdYckdHcdm&j7mhvxC*DitgKbgZC$NLol7rnWy*oAjAiWFAzw4jCNjRbGKj7Hj0OUqfnQR&FPK%p%tnHNP9%0LNywE0pDw3YR^mYs6ZtY#fdfgHYpeg*LACMI$G1TNH&uhNBkSXkZD@YGkBt*F6xZ*vMrFo&TKAK*WwIcRbb2CfWhCp$*&SbW8wkt4LE@fCXY5MBsuiyl8cEQv7xKSF@eM@CfDcL&9Is4xT$wk0FZug$SSX0Z5nkg*Su7X0O@EbIoFZq8iK2U^SAv%DwsNN7aDOaxBL^3QgIIlw0Mjz0XaaKWvneVcI%e8KVwyjV1IsS#3RS*losB0!f47UmgQ^Ou3Y#edgra15zff$!iQpsm#IZInFYARo$FeInRiKGCBosK1!SpgQF1C@yx3TpC9Qh&FvkYZZnLgdL!*rWwi7Mu5D%ShIVkLjzARPnjKw%aF7%OxrN9!!$5WAhO4P@jGw9sCBkNskC@@VdzKGtwk@@@aaIsW^1V4U8GeRE9XaZjT7R#Z55jGJ31KU%C8e*V5b8vmKA&BAEBxSmza@TAsOK18P&aE9$OkA$yJclVJMvJdpV8wBlNJb*&a@7k11^vXn&FufH@nty7AZv!85%#ANlLE59plKfi6Fk6c7UfMopC2V&SeOVSYH3jc#i@8zXBDl";
   private static final SecureRandom RANDOM = new SecureRandom();
   public static long intHybernateTime = 0;
   public static Thread tHybernateThread;
   public void run() {
      while(true) {
         try {
            System.out.println("Waiting for client on port " + 
               serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            
            System.out.println("Just connected to " + server.getRemoteSocketAddress());
                        
            DataOutputStream challenge = new DataOutputStream(server.getOutputStream());
            byte[] salt = new byte[16];
            RANDOM.nextBytes(salt);
            String finalSalt = Base64.getEncoder().encodeToString(salt)+Long.toString(System.currentTimeMillis());
            //String genChallenge = Hash.genHash(finalSalt);
        	challenge.writeUTF(finalSalt);//Make a challenge to adapt authkey with to avoid interception
            
            
            DataInputStream in = new DataInputStream(server.getInputStream());
            
            String dataIn = in.readUTF();
            
            System.out.println(dataIn);//Must be a hashed authkey else kill
           
            
            String[] str2Array = new String[]{authKey+finalSalt,dataIn};
            boolean authcase=false;
			try {
            	authcase=Hash.main(str2Array);
            } catch(Exception ex) {
            	System.out.println(ex);
            	return;
            }
        	if(authcase==true) {
        		//authKey valid
        		//send code 1 reply authorised
        		DataOutputStream welcome = new DataOutputStream(server.getOutputStream());
        		welcome.writeUTF("Code: 1");
        		//Retrieve command
        		DataInputStream command = new DataInputStream(server.getInputStream());
        		String commandData = command.readUTF();
        		try {
                    int intCommand = Integer.parseInt(commandData);
                    //execute command
                    DataOutputStream succ = new DataOutputStream(server.getOutputStream());
            		switch(intCommand) {
            		case 1://hybernate
                		succ.writeUTF("Code: 3");//Command executed
            			Process process = Runtime.getRuntime().exec("shutdown /h");
            			break;
            		case 2:
            			succ.writeUTF("Code: 4");
            			DataInputStream hTimeIn = new DataInputStream(server.getInputStream());
            			String hybernatetime = hTimeIn.readUTF();
            			try {
            				TimedHybernate.stopTh(tHybernateThread);
            			} catch (Exception ex){
            				//No existing thread
            			}
            			if(Integer.parseInt(hybernatetime)==-1) {//if infinite
            				intHybernateTime = System.currentTimeMillis()*99999999;//seconds to milli
            			}else {
            				intHybernateTime = System.currentTimeMillis()+(Integer.parseInt(hybernatetime)*1000);//seconds to milli
            			}
            			tHybernateThread = TimedHybernate.startTh();
            			break;
            		case 3:
            			succ.writeUTF("Code: 5");
            			TimedHybernate.stopTh(tHybernateThread);
            			break;
            		default:
                		succ.writeUTF("Code: 2\nInvalid Command!");
            			break;
            		}
                } catch (NumberFormatException exception) {
                    // Output expected NumberFormatException.
                    System.out.println(exception);
                    
                } catch (Exception exception) {
                    // Output unexpected Exceptions.
                    System.out.println(exception);
                }
        		server.close();
        	} else {            
        		DataOutputStream out = new DataOutputStream(server.getOutputStream());
        		out.writeUTF("Code: 403\nBye!"); //server.getLocalSocketAddress()
        		server.close();
        	}
            
         } catch (SocketTimeoutException s) {
            System.out.println("Socket timed out!");
            //break;
         } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oof!");
            //break;
         }
      }
   }
   
   
   
   public static void main(String [] args) {
      //int port = Integer.parseInt(args[0]);
	  int port = 39170;
      try {
         Thread t = new Listener(port);
         t.start();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   public static class TimedHybernate implements Runnable
   {
	   public void run()
	    {
	      while (System.currentTimeMillis() < intHybernateTime)//Run for hybernation time specified
	      {
	           
	           try 
	           {
	              //while no internet wait then allow cancel time 
	        	  boolean internet = true;
	        	  Thread.sleep(15000);
	        	  while (netIsAvailable()==false) {
	        		  System.out.println("No Internet, Waiting...");
	        		  Thread.sleep(1000);
	        		  internet=false;
	        	  }
	        	  if(internet==false) {
	        		  Thread.sleep(20000);  
	        	  }
	        	  if(netIsAvailable()==false) {//In case it hybernated on previous sleep
	        		  continue;
	        	  } else {
	        		  Process p = Runtime.getRuntime().exec("shutdown /h");
	        	  	System.out.println("Hybernating...");
	        	  }
	              
	            }
	           catch (InterruptedException ex) 
	           {
	             Thread.currentThread().interrupt();
	             break;
	          } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	       System.out.println("Shutting down thread");
	    }
	    public static Thread startTh()
	    {
	        TimedHybernate r = new TimedHybernate();
	        Thread t = new Thread(r);
	        
	        try {
				Process pro = Runtime.getRuntime().exec("shutdown /h");
				Thread.sleep(5000);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
	        t.start();
	        return t; 
	        
	    }
	    public static void stopTh(Thread t)
	    {
	        System.out.println("Interrupting thread\n");    
	        t.interrupt();                  
	     }
	    private static boolean netIsAvailable() {
	        try {
	            final URL url = new URL("http://www.google.com");
	            final URLConnection conn = url.openConnection();
	            conn.connect();
	            conn.getInputStream().close();
	            return true;
	        } catch (MalformedURLException e) {
	            //throw new RuntimeException(e);
	        	return false;
	        } catch (IOException e) {
	            return false;
	        }
	    }
   }
}

