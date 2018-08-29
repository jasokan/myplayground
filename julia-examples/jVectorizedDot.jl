# Vectorized Dot Operator

println([3,4,5] .^4)

jTest = [4.0, 5.0, 6.0]

println(sin.(jTest))
println(cos.(jTest))
println(tan.(jTest))

func(x,y) = x + 4y

jArray1 = [2.0, 4.0, 6.0]
jArray2 = [1.0, 3.0, 5.0]

println(func.(jArray1, jArray2))
