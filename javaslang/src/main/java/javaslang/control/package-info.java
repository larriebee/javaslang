/**
 * Control structures like the disjoint union type {@linkplain javaslang.control.Either}, the optional value type
 * {@linkplain javaslang.control.Option} and {@linkplain javaslang.control.Try} for exception handling.
 * <p>
 * <strong>Either</strong>
 * <p>
 * The control package contains an implementation of the {@linkplain javaslang.control.Either} control which is either Left or Right.
 * A given Either is projected to a Left or a Right.
 * Both cases can be further processed with control operations map, flatMap, filter.
 * If a Right is projected to a Left, the Left control operations have no effect on the Right value.
 * If a Left is projected to a Right, the Right control operations have no effect on the Left value.
 * <p>
 * <strong>Option</strong>
 * <p>
 * The Option control is a replacement for {@linkplain java.util.Optional}. An Option is either
 * {@linkplain javaslang.control.Option.Some} value or {@linkplain javaslang.control.Option.None}.
 * In contrast to Optional, Option supports null values, i.e. it is possible to call {@code new Some(null)}.
 * However, {@code Option.of(null)} results in None.
 * <p>
 * <strong>Try</strong>
 * <p>
 * Exceptions are handled with the {@linkplain javaslang.control.Try} control which is either a
 * {@linkplain javaslang.control.Try.Success}, containing a result, or a {@linkplain javaslang.control.Try.Failure},
 * containing an Exception.
 * <p>
 * Try internally handles exceptions by wrapping exceptions in a Cause.
 * A Cause is unchecked, i.e. a RuntimeException, and is Fatal or NonFatal.
 * Fatal exceptions cannot be handled and are thrown without further processing.
 * NonFatal exceptions are wrapped in a Failure.
 *
 * @since 1.0.0
 */
package javaslang.control;
