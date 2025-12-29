# Copilot Instructions: Inventur Helper

## Project Overview

**Inventur Helper** is an Android inventory management application built with **Jetpack Compose** and **Kotlin**. The app uses modern Android development practices with Material Design 3 theming. License: GNU General Public License v3.0.

## Key Architecture

- **Framework**: Jetpack Compose (modern declarative UI)
- **Language**: Kotlin 2.0.21
- **Target**: Android SDK 26+ (minSdk=26, targetSdk=36, compileSdk=36)
- **JVM Target**: Java 11
- **Entry Point**: [MainActivity.kt](app/src/main/java/com/sneakpi/inventurhelper/MainActivity.kt) - currently a simple template with Scaffold + Greeting component

## Code Organization

```
app/src/main/java/com/sneakpi/inventurhelper/
  ├── MainActivity.kt           # App entry point, Compose setup
  └── ui/
      └── theme/               # Material 3 theming
          ├── Color.kt         # Color palette (Purple, Pink theme)
          ├── Theme.kt         # Dynamic theme with dark mode support
          └── Type.kt          # Typography definitions
```

## Development Workflows

### Build & Run

```bash
./gradlew assembleDebug    # Build debug APK
./gradlew installDebug     # Install on connected device/emulator
./gradlew app:build        # Full debug build
```

### Testing

```bash
./gradlew test             # Unit tests (JUnit 4)
./gradlew connectedAndroidTest  # Instrumentation tests (Espresso)
```

### Development Setup

- **IDE**: Android Studio recommended (Gradle sync handles dependency resolution)
- **Gradle**: Uses version catalog ([libs.versions.toml](gradle/libs.versions.toml)) for dependency management
- **JVM Memory**: Default `-Xmx2048m` (configured in [gradle.properties](gradle.properties))

## Critical Dependencies & Patterns

### Compose Dependencies

- Core: `androidx.activity.compose`, `androidx.lifecycle.runtime.ktx`
- UI: Material 3 (`androidx.compose.material3`), compose-bom 2024.09.00
- Testing: Compose test JUnit4, Espresso, Android instrumentation runner

### Compose-First Patterns

1. **Activity Setup**: Use `enableEdgeToEdge()` before `setContent()` (see MainActivity)
2. **Theming**: Wrap entire app in `InventurHelperTheme` composable
3. **Theme Support**:
   - Dynamic theming for Android 12+ (Material You colors)
   - Manual dark mode fallback for older devices
   - Preview annotations for testing composables without running APK

### Android Project Configuration

- **Namespacing**: Enabled (`android.nonTransitiveRClass=true`) - reduces R class size
- **Resource Management**: AndroidX support + data backup/extraction rules
- **Kotlin Compiler**: Compose plugin enabled for `@Composable` annotation support

## Code Style & Conventions

- **Kotlin Code Style**: "official" (enforced via gradle.properties)
- **Compose Naming**: Composable functions PascalCase, use `@Composable` annotation
- **Modifiers**: Always pass as trailing lambda parameter with default value
- **Preview**: Use `@Preview` for compose testing during development

## Integration Points

- **Material Design 3**: Theme colors defined in [theme/Color.kt](app/src/main/java/com/sneakpi/inventurhelper/ui/theme/Color.kt)
- **Drawable Assets**: [mipmap-\*/](app/src/main/res/mipmap-mdpi) folders (launcher icons)
- **Manifest**: Single Activity app (no fragments) with Material theme applied

## Common Tasks

**Add a new Composable screen**:

1. Create file in `ui/screens/` following `ScreenNameScreen.kt` convention
2. Use `@Composable` annotation with modifier parameter
3. Wrap in `InventurHelperTheme` for preview
4. Integrate into MainActivity via `setContent()`

**Modify theme colors**:

1. Update `Color.kt` palette definitions
2. Adjust `DarkColorScheme`/`LightColorScheme` in `Theme.kt`
3. Test with `@Preview` on composables using color

**Handle edge cases**:

- Use Material 3 components (Scaffold, Surface) for layout structure
- Handle safe insets via `enableEdgeToEdge()` + Scaffold
- Test on multiple API levels (minSdk=26 is Android 8.0)

## Notes for AI Agents

- This is an early-stage project (versionCode=1, versionName="1.0") - assume minimal navigation/state management exists
- The codebase currently contains template/boilerplate code from new Android project
- No explicit MVVM/MVI patterns yet—compose composables manage local state directly
- Future additions should consider: navigation (Jetpack Navigation), state management (ViewModel/StateFlow), and data persistence as app grows
