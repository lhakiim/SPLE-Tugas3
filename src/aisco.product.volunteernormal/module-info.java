module aisco.product.volunteernormal {
    // 1. Modul "Core" harus di-require lebih dulu agar di-build awal
    requires aisco.volunteer.core;
    requires aisco.program.core;
    requires aisco.financialreport.core;
    
    // 2. Modul turunannya diletakkan di bawahnya
    requires aisco.program.activity;
    requires aisco.financialreport.income;
    
    exports aisco.product.volunteernormal;
}