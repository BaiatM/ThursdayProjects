public class Clock {
     public int hours;
     public int minutes;
     public int seconds;

     public Clock() {
            // TODO implement no args constructor
            hours = 12;
        }

        public Clock(int seconds) {
            // TODO implement one arg constructor
            hours = seconds/3600;
            if(this.hours>23){
                this.hours = (seconds/3600)%24;
                System.out.println("Days = "+ seconds/3600/24);
            }
            minutes = seconds%3600/60;
            this.seconds = seconds%3600%60;
        }

        public Clock(int hours, int minutes, int seconds) {
            //TODO implement all args constructor
            int minutesExtra = 0;
            int hoursExtra = 0;

            if (seconds>59){
                minutesExtra = seconds/60;
                this.seconds = seconds%60;
            } else if(seconds<0){
                System.out.println("Seconds cannot be negative");
            } else {
                this.seconds = seconds;
            }

            if (minutes>59){
                hoursExtra = minutes/60;
                this.minutes = minutes%60 +minutesExtra;
            } else if(minutes<0){
                System.out.println("Minutes cannot be negative");
            } else {
                this.minutes = minutes;
            }

            if (hours>23){
                this.hours = hours%24+hoursExtra;
            } else if(hours<0){
                System.out.println("Hours cannot be negative");
            } else {
                this.hours = hours;
            }
        }

        public void setClock(int seconds) {
            //TODO implement this method


        }

        public int getHours() {
            //TODO implement this method
            return this.hours;
        }

        public void setHours(int hours) {
            //TODO implement this method
            if (seconds >=0 && seconds<=23){
                this.hours = hours;
            }else{
                this.hours = hours%24;
            }
        }

        public int getMinutes() {
            //TODO implement this method
            return this.minutes;
        }

        public void setMinutes(int minutes) {
            //TODO implement this method
            if (minutes >=0 && minutes<=59){
                this.minutes = minutes;
            }else{
                this.minutes = minutes%60;
            }
        }

        public int getSeconds() {
            //TODO implement this method
            return this.seconds;
        }

        public void setSeconds(int seconds) {
            //TODO implement this method
            if (seconds >=0 && seconds<=59){
                this.seconds = seconds;
            }else{
                this.seconds = seconds%60;
            }

        }

        public void tick() {
            //TODO implement this method

        }


        public void tickDown() {
            //TODO implement this method

        }

        public void addClock(Clock clock) {
            //TODO implement this method

        }

        public Clock subtractClock(Clock clock) {
            //TODO implement this method
            return null;
        }

        @Override
        public String toString() {
            return "(" + String.format("%02d:%02d:%02d", this.getHours(), this.getMinutes(), this.getSeconds()) + ")";
        }
    }
