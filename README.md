# SDET Coding Assessment

SDET-Coding-Assessment  
├── src  
    &emsp;├── main  &emsp;# implementations  
        &emsp;&emsp;└── java  
            &emsp;&emsp;&emsp;├── Challenge1.java  
            &emsp;&emsp;&emsp;├── Challenge3.java  
            &emsp;&emsp;&emsp;├── challenge3_demo.txt  
            &emsp;&emsp;&emsp;└── Main.java  &emsp;#  quick demo  
    &emsp;└── test  # junit testing cases  
        &emsp;&emsp;└── java  
            &emsp;&emsp;&emsp;├── Challenge1Test.java  
            &emsp;&emsp;&emsp;└── Challenge3Test.java  
├── .gitignore  
├── README.md  
├── SDET Assessment Task 1.pdf    &emsp;#  task 1 submission  
├── SDET-Coding-Assessment.iml    &emsp;#  project setting  
└── pom.xml                       &emsp;#  maven  

## SDET Coding Assessment Task 1
Please see SDET Assessment Task 1.pdf

## SDET Coding Assessment Task 2
### Usage  
1. Quick Demo:   
$ java Main  
[ Demo for Challenge 1 ]  
1 2 Planit 4 Testing Planit 7 8 Planit Testing 11 Planit 13 14 PlanitTesting 16 17 Planit 19 Testing Planit 22 23 Planit Testing 26 Planit 28 29 PlanitTesting 31 32 Planit 34 Testing Planit 37 38 Planit Testing 41 Planit 43 44 PlanitTesting 46 47 Planit 49 Testing Planit 52 53 Planit Testing 56 Planit 58 59 PlanitTesting 61 62 Planit 64 Testing Planit 67 68 Planit Testing 71 Planit 73 74 PlanitTesting 76 77 Planit 79 Testing Planit 82 83 Planit Testing 86 Planit 88 89 PlanitTesting 91 92 Planit 94 Testing Planit 97 98 Planit Testing    
[ Demo for Challenge 3 ]  
"reverse order" -> "redro-esrever"  
"string    reverse    order" -> "redro-esrever-gnirts"  
"stringreverseorder" -> "redroesrevergnirts"  
"    reverse order " -> "-redro-esrever-"  
  
2. Run Challenge 1:  
$ java Challenge1  
3. Run Challenge 3:  
user can enter a string to repace and reverse  
$ java Challenge3  
process strings from an input file  
$ java Challenge3 challenge3_demo.txt  

### Testing
Junit 5 for unit testing
