I har fået out folderen med hvilket ikke er optimalt. Out folderen indeholder de filer der bliver genereret når jeres projekt bliver bygget. 
Hvilket vil sige at de ændrer sig konstant. Når I laver et nye projekt i IntelliJ, så burde der blive lavet et
.gitignore fil der udelukker denne folder fra git, jeg kan ikke helt gennemskue hvordan det er lykkes jer at få denne folder med i git.

---

removeStudentByName metoden bliver ikke brugt, sørg for at fjerne kode der ikke bliver brugt.

---

Jeg forstår ikke helt jeres kommentar på getHøjestekarakter metoden.
Metoden gør det den skal. 

---

Fint at I tjekker for om den studerende har en karakter i studerendeGennemsnit metoden, selv om opgavebeskrivelsen skriver at man kan antage det.

---

For at få gennemsnittet i gennemsnitTeam metoden skal I dividere med antallet af studerende.
Jeres guard clause

    if (studentList == null) return 0;

gør ikke noget, da studentList bliver initialiseret i constructoren og således aldrig kan være null.
Da man skal dividerer med størrelsen af studentList er en bedre guard clause.

    if (studentList.size() == 0) return 0;

---

I correctAnswers metoden behøver I ikke studentSvar variablen, I kan 
bare aflæse svar attributten direkte.

---

Rigtig fin besvarelse. 
