# Complex number computations

println(3 + 6im);

println((3+6im) + (3+6im));

println((3+6im) - (3+6im));
println((3+6im) * (3+6im));
println(0.8989(3+6im));
println((3+6im)^2);

jComplexTest = 3 + 6im;

println(real(jComplexTest));
println(imag(jComplexTest));
println(abs(jComplexTest));
println(abs2(jComplexTest));
println(angle(jComplexTest));
println(sqrt(jComplexTest));
println(cos(jComplexTest));
println(exp(jComplexTest));
println(sinh(jComplexTest));

realNum = 3;
imaginaryNum = 6;

println(complex(realNum, imaginaryNum));

println(3 + Inf*im);
println(3 + NaN*im);
