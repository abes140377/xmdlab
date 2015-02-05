package org.xmdlab.cartridge.jee.generator;

import com.google.inject.Inject;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmdlab.cartridge.common.generator.IGenerator;
import org.xmdlab.cartridge.jee.JeeCartridgeGeneratorInjectorProvider;
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade;
import org.xmdlab.cartridge.jee.transformation.JeeCartridgeTransformation;
import org.xmdlab.dsl.application.applicationDsl.DslApplication;
import org.xmdlab.dsl.application.applicationDsl.DslModel;
import org.xmdlab.jee.application.mm.Application;

@RunWith(XtextRunner.class)
@InjectWith(JeeCartridgeGeneratorInjectorProvider.class)
@SuppressWarnings("all")
public class JeeCartridgeGeneratorTest {
  @Inject
  private IGenerator underTest;
  
  @Inject
  private ParseHelper<DslModel> parseHelper;
  
  @Inject
  private JeeCartridgeTransformation transformation;
  
  @Inject
  private ApplicationMetafacade applicationMetafacade;
  
  @Test
  public void test() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Application application-manager {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("basePackage=org.application.manager");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("Entity Organisation {");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("String name;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("String description;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Entity Team {");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("String name;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("String description;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final DslModel model = this.parseHelper.parse(_builder);
      Resource _eResource = model.eResource();
      EList<EObject> _contents = _eResource.getContents();
      EObject _get = _contents.get(0);
      final DslModel dslModel = ((DslModel) _get);
      DslApplication _app = dslModel.getApp();
      final Application application = this.transformation.transform(_app);
      this.applicationMetafacade.setModelResource(application);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.underTest.doGenerate(fsa);
      Map<String, CharSequence> _textFiles = fsa.getTextFiles();
      InputOutput.<Map<String, CharSequence>>println(_textFiles);
      Map<String, CharSequence> _textFiles_1 = fsa.getTextFiles();
      int _size = _textFiles_1.size();
      Assert.assertEquals(2, _size);
      Map<String, CharSequence> _textFiles_2 = fsa.getTextFiles();
      boolean _containsKey = _textFiles_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "Alice.java"));
      Assert.assertTrue(_containsKey);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("public class Alice {");
      _builder_1.newLine();
      _builder_1.append("     ");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      String _string = _builder_1.toString();
      Map<String, CharSequence> _textFiles_3 = fsa.getTextFiles();
      CharSequence _get_1 = _textFiles_3.get((IFileSystemAccess.DEFAULT_OUTPUT + "Alice.java"));
      String _string_1 = _get_1.toString();
      Assert.assertEquals(_string, _string_1);
      Map<String, CharSequence> _textFiles_4 = fsa.getTextFiles();
      boolean _containsKey_1 = _textFiles_4.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "Bob.java"));
      Assert.assertTrue(_containsKey_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("public class Bob {");
      _builder_2.newLine();
      _builder_2.append("     ");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      String _string_2 = _builder_2.toString();
      Map<String, CharSequence> _textFiles_5 = fsa.getTextFiles();
      CharSequence _get_2 = _textFiles_5.get((IFileSystemAccess.DEFAULT_OUTPUT + "Bob.java"));
      String _string_3 = _get_2.toString();
      Assert.assertEquals(_string_2, _string_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
