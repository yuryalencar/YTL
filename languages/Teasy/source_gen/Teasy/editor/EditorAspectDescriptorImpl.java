package Teasy.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Action_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ActionItemList_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new ActionListToImplement_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ActionListToReferences_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new ActiveActionElement_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new Actor_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new ActorItemList_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new ActorListToImplement_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new ActorListToReferences_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new BlockAction_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new BlockActionItemList_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new BlockActionListToImplement_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new BlockActionListToReferences_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new ClickElement_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new Component_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new Components_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new Configuration_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new ConfigurationOld_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new DataForAction_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new ElementToReceiveData_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new ElementToReceiveDataItemList_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new ElementToReceiveDataListToImplement_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new ElementToReceiveDataListToReferences_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new ExecuteJavascript_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new Flow_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new FlowListToImplement_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new InputText_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new InvalidData_Editor());
      case 28:
        return Collections.<ConceptEditor>singletonList(new Keyword_Editor());
      case 29:
        return Collections.<ConceptEditor>singletonList(new Page_Editor());
      case 30:
        return Collections.<ConceptEditor>singletonList(new PageListToImplement_Editor());
      case 31:
        return Collections.<ConceptEditor>singletonList(new PageShouldContain_Editor());
      case 32:
        return Collections.<ConceptEditor>singletonList(new PageShouldContainElement_Editor());
      case 33:
        return Collections.<ConceptEditor>singletonList(new PageShouldNotContain_Editor());
      case 34:
        return Collections.<ConceptEditor>singletonList(new PageShouldNotContainElement_Editor());
      case 35:
        return Collections.<ConceptEditor>singletonList(new ValidData_Editor());
      case 36:
        return Collections.<ConceptEditor>singletonList(new VerifierElement_Editor());
      case 37:
        return Collections.<ConceptEditor>singletonList(new VerifierElementItemList_Editor());
      case 38:
        return Collections.<ConceptEditor>singletonList(new VerifierElementListToImplement_Editor());
      case 39:
        return Collections.<ConceptEditor>singletonList(new VerifierElementListToReferences_Editor());
      case 40:
        return Collections.<ConceptEditor>singletonList(new WaitForCondition_Editor());
      case 41:
        return Collections.<ConceptEditor>singletonList(new WaitUntilElementIsEnabled_Editor());
      case 42:
        return Collections.<ConceptEditor>singletonList(new WaitUntilElementIsNotVisible_Editor());
      case 43:
        return Collections.<ConceptEditor>singletonList(new WaitUntilElementIsVisible_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c03L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f2b945cL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f2b945fL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f327511L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c10L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bffL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3b1678L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x339c4c2c735cc22dL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3b1676L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c0aL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3db376L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3db372L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f3db375L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f432adL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e118846bL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x7dbf8857483dd032L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x637c9747e115f171L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfbL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c0dL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78b1L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f46f9b5L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f46f9b3L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f46f9b4L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f432fbL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c16L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f75d2a8L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80c7b56fL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78a5L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x29b0fffc80bf369dL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4bfcL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x339c4c2c735d64ffL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f4341dL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f4345eL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f434aaL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f434acL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x5862803877ab78a2L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0xb2a36ad4ddb4c02L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f4fb299L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x339c4c2c735d6641L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x4ce181543f4fb298L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f4336bL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f448f8L), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f4486aL), MetaIdFactory.conceptId(0x67c1fa65c7ac493dL, 0xb11b664188147c91L, 0x1afad254c1f44869L)).seal();
}
