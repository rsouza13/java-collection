# Functional Interface

Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.


Consumer<T>: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.

	Ex.: Collection.stream_api().forEach(Consumer<T>)

Supplier<T>: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. É comumente usada para criar ou fornecer novos objetos de um determinado tipo.

	Ex.: Collection.Stream.g enerate(Supplier<T>)

Function<T, R>: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.

	Ex.: Collection.stream_api()
		.map(Function<T, T>)
	        .collect(Collectors.toList());

Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso). É comumente usada para filtrar os elementos do Stream com base em alguma condição.

	Ex.: Collection.stream_api()
        	.filter(Predicate<T>)
	        .collect(Collectors.toList());

BinaryOperator<T>: Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T. É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

	Ex.: Collection.stream_api()
	        .reduce(0, BinaryOperator<T>);